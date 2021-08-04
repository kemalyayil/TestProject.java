package Day41.AnimalPackage;

public abstract class Animal {
    // in public class we can not create an abstract method. illa ki abstract eklenmesi gerek

    private String name;
    private  int DOB;

   public Animal(String name,int DOB){
       this.name = name;
       this.DOB = DOB;
   }

   public abstract void eat();

   public  abstract void makeSound();

   public abstract void move();


}
