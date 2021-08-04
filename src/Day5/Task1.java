package Day5;

public class Task1 {
    public static void main(String[] args) {
        String number5 = "8";
        short sum = (short) (Short.parseShort(number5) + 4); // burada int short a convert ettik.
        System.out.println(sum);

        String numberOfTheStudents = "27";  // bunu ben yaptim. %99 convert edilen int. digerleri nadir.
        int sum2 = Integer.parseInt(numberOfTheStudents) + 2;
        System.out.println("sum2 = " + sum2);

        String priceOfLaptopIncludingTax = "1200";
        double sum3 = (double) (Double.parseDouble(priceOfLaptopIncludingTax) * 1.18);
        System.out.println("sum3 = " + sum3);

        String num = "8";
        short sum33 = (short) (Integer.parseInt(number5) + 4); // yukardaki sikinti olan yeri hoca duzeltti, (short) a cevirdikten sonra Integer yazilmasi lazimmis
        System.out.println(sum33);




    }
}
