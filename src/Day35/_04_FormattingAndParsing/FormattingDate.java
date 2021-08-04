package Day35._04_FormattingAndParsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        //ofLocalizedDate method
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); // day+month+day+year
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);   // month + day and year
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); // month(kisa) + day + year
        System.out.println(now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); // only numbers(M/D/Y)
        System.out.println(now.format(formatter));
            /*
                    Wednesday, June 2, 2021
                    June 2, 2021
                    Jun 2, 2021
                    6/2/21
             */

        // ofPattern Method
        formatter = DateTimeFormatter.ofPattern("YY\\MMMM\\dd");  //   02\June\21
        System.out.println(now.format(formatter));


    }
}
