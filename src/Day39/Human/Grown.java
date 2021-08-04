package Day39.Human;

public class Grown extends Human{

    public Grown (String name, double age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println("Grown people can eat many things");
    }

    @Override
    public void transport(){
        System.out.println("Grown people can transport however they want.");
    }
}
