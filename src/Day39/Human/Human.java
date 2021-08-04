package Day39.Human;

public class Human {
    String name;
    double age;


    public Human(String name,double age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Human is eating!");
    }

    public void transport(){
        System.out.println("Human is transporting");
    }
}
