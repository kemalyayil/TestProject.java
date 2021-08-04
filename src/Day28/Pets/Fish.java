package Day28.Pets;

import java.util.List;

public class Fish {
    String name;
    String color;
    List<String > listOfNeeds;
    Owner ownerInfo;


    void printProperties(){
        System.out.println("Name : " + name + " , Color : " + color + " , List of needs" + listOfNeeds);
        ownerInfo.printProperties();
    }
}
