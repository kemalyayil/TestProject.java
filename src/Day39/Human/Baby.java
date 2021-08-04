package Day39.Human;

public class Baby extends Human {

    public Baby(String name, double age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Babies can drink milk as they were born");
    }

    @Override
    public void transport() {
        System.out.println("They are needed to be helped by the others to transport");
    }
}
