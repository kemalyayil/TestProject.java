package Day42.MultipleInheritance;

public class Child implements Parent1,Parent2{

    @Override
    public void method1() {
        System.out.println("This method is from Parent1- Method1");
        System.out.println(variable1);          // from Parent 1
        System.out.println(variable3);          // from Parent 2
        System.out.println(Parent1.variable2);  // Same named variable from Parent 1
        System.out.println(Parent1.variable2);  // Same named variable from Parent 2
    }

    // we have this method in both parent Interfaces but
    // overriding once is enough .. aynisindan iki tane var, fakat bir defa override yapip kullanmak yeterli
    @Override
    public void method2() {
        System.out.println("This method is from both Parent 1 and Parent 2");
    }

    @Override
    public void method3() {
        System.out.println("This method is from both Parent 2 , method 3");
    }
    /**
     * -Like abstract classes, interfaces cannot be used to create objects
     * -Interface methods do not have a body - the body is provided by the "implementing" class
     * -On implementation of an interface, you must override all of its methods

     * -An interface cannot contain a constructor
     * -Interface cannot be declared as private, protected or transient.
     *
     */
}
