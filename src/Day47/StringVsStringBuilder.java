package Day47;

import java.util.Locale;

public class StringVsStringBuilder {
    public static void main(String[] args) {


        String str = "TechnoStudy";

        str.toUpperCase();              // TechnoStudy
        System.out.println(str);

        String strUpperCased = str.toUpperCase();        // TECHNOSTUDY  ==> burada yeni string olusturdugumuz icin oluyor
        System.out.println("strUpper = " + strUpperCased);


        String strLower = strUpperCased.toLowerCase(Locale.ROOT);
        System.out.println("strLower = " + strLower);


        StringBuilder stringBuilder = new StringBuilder("TechnoStudy");     // we can change values in stringbuilder
        System.out.println("StrBuilder 1 = " + stringBuilder);
        stringBuilder.append(" - SDET Course");
        System.out.println("StrBuilder 2 = " + stringBuilder);

        System.out.println(stringBuilder.capacity());   //27

        stringBuilder.delete(5,9);
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());   // 27==> silmemize ragmen boyle oldu, cunku o (index 27)
                                                        // potansiyelde oldugu icin- Line 39 a bak.capacity ve length
                                                        // ayri seyler.

        stringBuilder.insert(5,"ostu");     // 5. index ten sonrasina istedigimiz text i yerlestirdik. yazdirdi.
        System.out.println(stringBuilder);

        System.out.println("length = " + stringBuilder.length());  // capacity ve length ayri seyler.
        
    }


}
