package Day39.AnimalPackage;

public class Animal {
    int age;
    String name;

    public Animal(int age, String name){
        this.name = name;
        this.age = age;
    }


    public void eat(){
        System.out.println("Animal is eating ! ");
    }

    public void sleep(){
        System.out.println("Animal is sleeping ! ");
    }


}
