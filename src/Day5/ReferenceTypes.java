package Day5;

import Day5.HumanClass.Human;

import java.util.Date;

public class ReferenceTypes {
    
    public static void main(String[] args) {
     
        byte age = 45;

        Date now = new Date(); // ='den sonra new dedigimiz zaman java bilgisayardaki tarihe gidip  buraya yapistirir.
                                //date yazdiktan sonra gelen 'java util' opsiyonunu sectikten sonra sonuca ulastik.



        Human John = new Human() ;

        System.out.println(John);

    }
}
