package Day40.TASK1;

public class Animal {

    String name;
    public Animal(){
        this.name = "Animal";
    }


    public void run(int meters){
        System.out.println(name + " is running " + meters + " meters");
    }

    //overloaded
    public void run(int units, String unit) {
        System.out.println(name + " is running " + units + " " + unit);
    }

    public void makeSound(){
        System.out.println(name + " is making sound");
    }


}
