package Homework.Homework35_Enum_Task1;

import java.util.Scanner;

public class MainMonths {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first three characters of your month to check if it is among first 3 months: ");
        String months = scanner.nextLine();

        CheckFirst3Moths monthsCheck = new CheckFirst3Moths(Months.valueOf(months));

      switch (monthsCheck.getMonths()){
          case Jan:
              System.out.println("First month is January!");
              break;
          case Feb:
              System.out.println("Second month is February!");
              break;
          case Mar:
              System.out.println("Third month is March!");
              break;
          default:
              System.out.println("The month which was chosen is not in first 3 months!!!");
      }



    }

}
