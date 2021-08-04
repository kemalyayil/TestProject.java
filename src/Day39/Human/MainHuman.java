package Day39.Human;
            // we can not override a static method .Static method is in class level not out of the class. for
            // overriding we use created methods in different classes.
// but we can overload a static method, because overloading happens in the same class.
public class MainHuman {
    public static void main(String[] args) {
        Baby baby = new Baby("Liping",0.2);
        baby.eat();
        baby.transport();

        System.out.println("-------------------------------------");

        Grown grown = new Grown("Cengiz",41);
        grown.eat();
        grown.transport();
    }
}
