package Day5;

import java.awt.*;
/*
COK ONEMLI : Reference types are copied by the references but primitive types are copied by their values!
 */

public class PrimitiveVsReference {

    public static void main(String[] args) {

        byte x = 1;
        byte y = x;
        System.out.println(y);
        System.out.println(x);

        x = 3;
        System.out.println(y);  // yukarda x ve y 1 dendi. sonra x update edildi. y hala 1 olmaya devam etti
                                // cunku yukardaki value java tarafindan kopyalanir, update edilse bile degismez
                                // cunku birbirinden bagimsiz olduklarindan dolayi. sadece baslangicta bi copy/paste var
                                // o kadar.
        System.out.println(x);

       Point point1 = new Point(1,1);
       Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);

        point1 .x= 2;
        System.out.println(point1);
        System.out.println(point2);


    }
}
