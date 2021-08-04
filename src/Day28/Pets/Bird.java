package Day28.Pets;

import java.util.List;

public class Bird {

    String name ;
    String color ;
    List<String> listOfNeeds;  // diger sayfada arraylist kullanmak lazim
    Owner owner;

    void printProperties(){
        System.out.println("Name : " + name + " , Color : " + color + " , List of needs" + listOfNeeds);
        owner.printProperties();
    }
}
