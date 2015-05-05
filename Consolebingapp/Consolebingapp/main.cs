using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Consolebingapp
{
    class main
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Run...");
            //string result = Translator.translate("en", "كتاب", "ar");
            string result = Translator.translate("en","الكتاب على الطاولة","ar");
            Console.WriteLine(result);
            result = Translator.translate("en", "الكلب يجري في الحديقة",null);
            Console.WriteLine(result);

            Console.ReadKey(true);
        }
    }
}
