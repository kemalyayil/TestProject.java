package Day28;

public class MainYanlis {
    public static void main(String[] args) {

        Dog lucy = new Dog();
        lucy.breed = "Neapolitan Mastiff";
        lucy.size = "Large";
        lucy.age = 5;
        lucy.color = "Black";
        lucy.isSleeping = false;

        System.out.println("Is Lucy sleeping ? ---> " + lucy.isSleeping);
        lucy.setSleeping();  // main den cagirip update ettik
        System.out.println("Is Lucy sleeping2 ? ---> " + lucy.isSleeping);  // method olarak cagirdik. o zaman true yazdi.
                                                                            // cunku main de o sekilde ayarlamistik.


        // MAX
        Dog max = new Dog();
        max.breed = "Maltese";
        max.size= "Medium";
        max.age= 2;
        max.color="White";
        max.isSleeping= true;

        System.out.println("Max's age    = " + max.age);
        System.out.println("Max's color  = " + max.color);

        //max.snoring();  // max icin print edecek ama lucy icin hayir. cunku kosulda (line 11) false dedik.
                        // lucy icin hic bir sey yazdirmayacal

        lucy.snoring();



    }
}
