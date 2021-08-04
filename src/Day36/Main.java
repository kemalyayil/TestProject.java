package Day36;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        //employee.baseSalary = 90_000;         // method yazdiktan sonra employee sinifinda , bunu da cikarttik
        //employee.extraHours = 10;
       // employee.hourlyRate = 45;

        employee.setBaseSalary(90_000);
        int baseSalary = employee.getBaseSalary();
        employee.setHourlyRate(45);
        int hourlyRate = employee.getHourlyRate();


        
        int wage = employee.calculateWage(10);   // 10 u sonradan yazdik.employee sinifindaki
        System.out.println("Base salary = " + baseSalary);    //degisiklikten sonra
        System.out.println("Wage        = " + wage);
        System.out.println("hourlyRate  = " + hourlyRate);

        


        // asagidakine gerek yok , cunku yukardaki daha clean.
//        int baseSalary = 90_000;
//        int hourlyRate = 45;
//        int extraHours = 10;
//
//        int wage = calculateWage(baseSalary, hourlyRate, extraHours);
//        System.out.println("wage = " + wage);
//
//
//    }
//    public static int calculateWage(
//        int baseSalary,
//        int hourlyRate,
//        int extraHours
//    )
//    {
//       return baseSalary + (hourlyRate * extraHours);
    }

}
