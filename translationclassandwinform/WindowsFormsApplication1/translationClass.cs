using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApplication1
{
    class translationClass
    {

        string strTranslatedText = null;
        string str2 = "hi";
        string from1 = "";
        string to1 = "en";
        public void main()
        {

            translation(str2);
        }

        public void translation(string str1)
        {
            try
            {
                ServiceReference1.LanguageServiceClient client = new ServiceReference1.LanguageServiceClient("BasicHttpBinding_LanguageService");

                strTranslatedText = client.Translate("Bearer" + "/MiaaTuasuq7if2bxG1VLIaxZiAuyRvIvlszTv1FgwA=", str1, from1, to1);
                Console.Write(strTranslatedText);
            }
            catch (Exception ex)
            {
                Console.Write("error");

            }
        }
    }
}
