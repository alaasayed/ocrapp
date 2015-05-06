/*
 * Copyright 2015 new.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//this is image processing with ocr
package tessdata;

import com.sun.jna.Pointer;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.IJ;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import ij.gui.Roi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import net.sourceforge.tess4j.TessAPI;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.vietocr.ImageIOHelper;


/**
 *
 * @author new
 */
public class ocr {
    private static ImageProcessor ip1;
    static  String str1;
 static String imagepath = "l4.jpg";
 static String outfpath="C:\\Users\\new\\Desktop\\Tess4J-1.4-src\\Tess4J";
    
    public static void main(String[] args) throws Exception {
    
        
  ocrjimage(imagepath,outfpath);
    
    }
    public  static void ocrjimage(String imagepath,String outfilepath) throws FileNotFoundException, UnsupportedEncodingException, IOException{
     ImageProcessor ip ;
 ImagePlus IPL2;
         Image AWT_image;
        
        ImagePlus IPL_image; 
         
        String datapath = "tessdata";
        System.out.println("Hello");// TODO code application logic here
        System.setProperty("jna.library.path", "32".equals(System.getProperty("sun.arch.data.model")) ? "lib/win32-x86" : "lib/win32-x86-64");
        System.setProperty("sun.arch.data.model", "32".equals(System.getProperty("sun.arch.data.model")) ? "lib/win32-x86" : "lib/win32-x86-64");
        TessAPI api;
        TessAPI.TessBaseAPI handle;
        System.out.println("TessBaseAPIGetIterator");
        
        IPL_image = IJ.openImage(imagepath );
     
        String lang = "eng";
     File tiff1= new File(imagepath);
       BufferedImage image1= ImageIO.read(new FileInputStream(tiff1)); // require jai-imageio lib to read TIFF
       IPL_image.setImage(image1 );
        ip = IPL_image.getProcessor();
      ip.blurGaussian(0.2);
          ip.multiply(1.15);
        Roi r1 ;
        IPL_image.setRoi(0, 0, 1800,850);
         IPL_image.saveRoi();
        // IPL_image.show();
         ip1=ip;
         ip1.setRoi(0, 0, 1800,850);
  ip1= ip.crop();
  ip1.sharpen();
  ip1.scale(1,1);
        BufferedImage buffimg = ip1.getBufferedImage();
        IPL2 = IJ.openImage(imagepath );
         IPL2.setImage(buffimg);
          IPL2.show();
        System.out.println(buffimg.getHeight());
      ip1=IPL_image.getProcessor();

       ///  do image process here

// r1.drawPixels(ip1);

 
          ip.autoThreshold();
           AWT_image = ip.createImage();
           IPL_image.setImage(AWT_image);
        ImagePlus cimg = IPL_image.createImagePlus();
      cimg.setImage(AWT_image);
           cimg.setProcessor(ip);
 
 BufferedImage bi = cimg.getBufferedImage();
    File outputfile = new File("saved.jpg");
    ImageIO.write(bi, "jpg", outputfile);
 
 

   cimg.updateImage();

 

            File tiff = new File("saved.jpg");
      BufferedImage image = ImageIO.read(new FileInputStream(tiff)); // require jai-imageio lib to read TIFF
   
        ByteBuffer buf = ImageIOHelper.convertImageData(  image );
                int bpp =  image.getColorModel().getPixelSize();
        int bytespp = bpp / 8;
        int bytespl = (int) Math.ceil( image.getWidth() * bpp / 8.0);
        api = new TessDllAPIImpl().getInstance();
        handle = api.TessBaseAPICreate();


        api.TessBaseAPIInit3(handle, datapath, lang);
        api.TessBaseAPISetPageSegMode(handle, TessAPI.TessPageSegMode.PSM_AUTO);
        System.out.print( image.getWidth());
        api.TessBaseAPISetImage(handle, buf, image.getWidth(),  image.getHeight(), bytespp, bytespl);
         
        api.TessBaseAPIRecognize(handle, null);
        TessAPI.TessResultIterator ri = api.TessBaseAPIGetIterator(handle);
        TessAPI.TessPageIterator pi = api.TessResultIteratorGetPageIterator(ri);
        api.TessPageIteratorBegin(pi);
        
        PrintWriter out1 = new PrintWriter(outfilepath+"\\outputf.txt", "UTF-8");
     //   System.out.println("word left top right bottom");
        out1.print("word left top right bottom\n");
        out1.println();
 
        do {
            Pointer ptr = api.TessResultIteratorGetUTF8Text(ri, TessAPI.TessPageIteratorLevel.RIL_WORD);
            String word;
            if (ptr == null) {
                continue;
            }
            word = ptr.getString(0);
            api.TessDeleteText(ptr);

            IntBuffer leftB = IntBuffer.allocate(1);
            IntBuffer topB = IntBuffer.allocate(1);
            IntBuffer rightB = IntBuffer.allocate(1);
            IntBuffer bottomB = IntBuffer.allocate(1);
            api.TessPageIteratorBoundingBox(pi, TessAPI.TessPageIteratorLevel.RIL_WORD, leftB, topB, rightB, bottomB);
            int left = leftB.get();
            int top = topB.get();
            int right = rightB.get();
            int bottom = bottomB.get();
           // System.out.print(String.format("%s %d %d %d %d ", word, left, top, right, bottom) + "\n");
            out1.print(String.format("%s %d %d %d %d ", word, left, top, right, bottom) + "\n");
            out1.println();
        } while (api.TessPageIteratorNext(pi, TessAPI.TessPageIteratorLevel.RIL_WORD) == TessAPI.TRUE);
        out1.close();
      
         File imgf = new File("saved.jpg");
        
         Tesseract  inst  =Tesseract.getInstance();
inst.setDatapath(System.getenv(outfpath));
ImageIO.scanForPlugins();
     
   

    
//        // TODO code application logic here
        try  {
        String  res=inst.doOCR(imgf);
        str1=res;
      System.out.println(res);

        }catch  (TesseractException  e)
        {
        System.err.println(e.getMessage());
        }
    
    }
    
    }
       
