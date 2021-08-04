package Day35._04_FormattingAndParsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDate {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd uuuu");  // uuuu = year
        String date = "11 03 2020";     // yukardakinin order i burdaki ile ayni olmali.

        LocalDate convertedFromString = LocalDate.parse(date,formatter);
        System.out.println(convertedFromString);       //2020-11-03

        String convertedFromDate = convertedFromString.toString();
        System.out.println(convertedFromDate);
    }
}
