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
package tessdata;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.awt.Image;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.sourceforge.tess4j.TessAPI;

/**
 *
 * @author new
 */

    

public class TessDllAPIImpl implements TessAPI {
public TessAPI getInstance() {
return INSTANCE;
}
public void TessDllEndPage() {
}
public void TessDllRelease() {
}
public boolean SetVariable(String variable, String value) {
throw new UnsupportedOperationException("Not supported yet.");
}
public void SimpleInit(String datapath, String language, boolean numeric_mode) {
throw new UnsupportedOperationException("Not supported yet.");
}
public int Init(String datapath, String outputbase, String configfile, boolean numeric_mode, int argc, String[] argv) {
throw new UnsupportedOperationException("Not supported yet.");
}
public int InitWithLanguage(String datapath, String outputbase, String language, String configfile, boolean numeric_mode, int argc, String[] argv) {
throw new UnsupportedOperationException("Not supported yet.");
}
public int InitLangMod(String datapath, String outputbase, String language, String configfile, boolean numeric_mode, int argc, String[] argv) {
throw new UnsupportedOperationException("Not supported yet.");
}
public void SetInputName(String name) {
throw new UnsupportedOperationException("Not supported yet.");
}
public String TesseractRect(ByteBuffer imagedata, int bytes_per_pixel, int bytes_per_line, int left, int top, int width, int height) {
throw new UnsupportedOperationException("Not supported yet.");
}
public String TesseractRectBoxes(ByteBuffer imagedata, int bytes_per_pixel, int bytes_per_line, int left, int top, int width, int height, int imageheight) {
throw new UnsupportedOperationException("Not supported yet.");
}
public String TesseractRectUNLV(ByteBuffer imagedata, int bytes_per_pixel, int bytes_per_line, int left, int top, int width, int height) {
throw new UnsupportedOperationException("Not supported yet.");
}
public void ClearAdaptiveClassifier() {
throw new UnsupportedOperationException("Not supported yet.");
}
public void End() {
throw new UnsupportedOperationException("Not supported yet.");
}
public void DumpPGM(String filename) {
throw new UnsupportedOperationException("Not supported yet.");
}
public Image GetTesseractImage() {
throw new UnsupportedOperationException("Not supported yet.");
}
public int OtsuStats(int histogram, int H_out, int omega0_out) {
throw new UnsupportedOperationException("Not supported yet.");
}
public int IsValidWord(String string) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public String TessVersion() {
throw new UnsupportedOperationException("Not supported yet.");
}
public void TessDeleteText(String text) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessDeleteIntArray(IntBuffer arr) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public TessBaseAPI TessBaseAPICreate() {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPIDelete(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPISetInputName(TessBaseAPI handle, String name) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPISetOutputName(TessBaseAPI handle, String name) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPISetVariable(TessBaseAPI handle, String name, String value) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIGetIntVariable(TessBaseAPI handle, String name, IntBuffer value) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIGetBoolVariable(TessBaseAPI handle, String name, IntBuffer value) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIGetDoubleVariable(TessBaseAPI handle, String name, DoubleBuffer value) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public String TessBaseAPIGetStringVariable(TessBaseAPI handle, String name) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPIPrintVariablesToFile(TessBaseAPI handle, String filename) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIInit1(TessBaseAPI handle, String datapath, String language, int oem, PointerByReference configs, int configs_size) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIInit2(TessBaseAPI handle, String datapath, String language, int oem) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIInit3(TessBaseAPI handle, String datapath, String language) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIInitLangMod(TessBaseAPI handle, String datapath, String language) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPIInitForAnalysePage(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override

public void TessBaseAPIReadConfigFile(TessBaseAPI handle, String filename, int init_only) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPISetPageSegMode(TessBaseAPI handle, int mode) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIGetPageSegMode(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override

public Pointer TessBaseAPIRect(TessBaseAPI handle, ByteBuffer imagedata, int bytes_per_pixel, int bytes_per_line, int left, int top, int width, int height) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override

public void TessBaseAPIClearAdaptiveClassifier(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPISetImage(TessBaseAPI handle, ByteBuffer imagedata, int width, int height, int bytes_per_pixel, int bytes_per_line) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPISetRectangle(TessBaseAPI handle, int left, int top, int width, int height) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPIDumpPGM(TessBaseAPI handle, String filename) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public TessPageIterator TessBaseAPIAnalyseLayout(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIRecognize(TessBaseAPI handle, ETEXT_DESC monitor) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIRecognizeForChopTest(TessBaseAPI handle, ETEXT_DESC monitor) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public TessResultIterator TessBaseAPIGetIterator(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public Pointer TessBaseAPIProcessPages(TessBaseAPI handle, String filename, String retry_config, int timeout_millisec) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public Pointer TessBaseAPIGetUTF8Text(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public Pointer TessBaseAPIGetHOCRText(TessBaseAPI handle, int page_number) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public Pointer TessBaseAPIGetBoxText(TessBaseAPI handle, int page_number) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public Pointer TessBaseAPIGetUNLVText(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIMeanTextConf(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public IntByReference TessBaseAPIAllWordConfidences(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIAdaptToWordStr(TessBaseAPI handle, int mode, String wordstr) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPIClear(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}


@Override
public void TessBaseAPIEnd(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIIsValidWord(TessBaseAPI handle, String word) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessBaseAPIGetTextDirection(TessBaseAPI handle, IntBuffer out_offset, FloatBuffer out_slope) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public String TessBaseAPIGetUnichar(TessBaseAPI handle, int unichar_id) {
throw new UnsupportedOperationException("Not supported yet.");
}
public String TessBaseGetInitLanguagesAsString(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
public void TessBaseAPISetMinOrientationMargin(TessBaseAPI handle, double margin) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessPageIteratorDelete(TessPageIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public TessPageIterator TessPageIteratorCopy(TessPageIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessPageIteratorBegin(TessPageIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override

public int TessPageIteratorNext(TessPageIterator handle, int level) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessPageIteratorIsAtBeginningOf(TessPageIterator handle, int level) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessPageIteratorIsAtFinalElement(TessPageIterator handle, int level, int element) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessPageIteratorBoundingBox(TessPageIterator handle, int level, IntBuffer left, IntBuffer top, IntBuffer right, IntBuffer bottom) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override


public int TessPageIteratorBlockType(TessPageIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessPageIteratorBaseline(TessPageIterator handle, int level, IntBuffer x1, IntBuffer y1, IntBuffer x2, IntBuffer y2) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessPageIteratorOrientation(TessPageIterator handle, IntBuffer orientation, IntBuffer writing_direction, IntBuffer textline_order, FloatBuffer deskew_angle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessResultIteratorDelete(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override

public TessResultIterator TessResultIteratorCopy(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public TessPageIterator TessResultIteratorGetPageIterator(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public TessPageIterator TessResultIteratorGetPageIteratorConst(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public Pointer TessResultIteratorGetUTF8Text(TessResultIterator handle, int level) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public float TessResultIteratorConfidence(TessResultIterator handle, int level) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public String TessResultIteratorWordFontAttributes(TessResultIterator handle, IntBuffer is_bold, IntBuffer is_italic, IntBuffer is_underlined, IntBuffer is_monospace, IntBuffer is_serif, IntBuffer is_smallcaps, IntBuffer pointsize, IntBuffer font_id) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessResultIteratorWordIsFromDictionary(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessResultIteratorWordIsNumeric(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessResultIteratorSymbolIsSuperscript(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessResultIteratorSymbolIsSubscript(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public int TessResultIteratorSymbolIsDropcap(TessResultIterator handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
public String  APIGetInitLanguagesAsString(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public PointerByReference TessBaseAPIGetLoadedLanguagesAsVector(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public PointerByReference TessBaseAPIGetAvailableLanguagesAsVector(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessBaseAPISetSourceResolution(TessBaseAPI handle, int ppi) {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void TessDeleteText(Pointer text) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
@Override
public void TessDeleteTextArray(PointerByReference arr) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
@Override
public int TessBaseAPIGetThresholdedImageScaleFactor(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
@Override
public TessMutableIterator TessBaseAPIGetMutableIterator(TessBaseAPI handle) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

    @Override
    public String TessBaseAPIGetInitLanguagesAsString(TessBaseAPI handle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
} 
    
     