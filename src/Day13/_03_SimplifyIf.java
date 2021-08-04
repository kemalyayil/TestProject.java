package Day13;

public class _03_SimplifyIf {
    public static void main(String[] args) {

//        int income = 120000;               bu yontem biraz uzun olani
//        boolean isHighIncome;
//
//        if (income > 100000){
//            isHighIncome = true;
//        } else {
//            isHighIncome =false;
//        }
//        System.out.println(isHighIncome);


//        int income = 120000;          // bu yontem biraz daha az icerigi var. ayni sonuc aliyoruz
//        boolean isHighIncome = false;  // buarada asagida verdigimiz deger e gelene kadar false , gectikten sonra true yaz fiyoruz
//
//        if (income > 100000){
//            isHighIncome = true;
//        }
//        System.out.println(isHighIncome);

        int income = 120000;
        boolean isHighIncome = income > 100000; // en kisasi bu sekilde

        System.out.println(isHighIncome);
    }
}
