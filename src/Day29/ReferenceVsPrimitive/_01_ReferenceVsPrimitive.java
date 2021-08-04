package Day29.ReferenceVsPrimitive;

public class _01_ReferenceVsPrimitive {
    public static void main(String[] args) {
        // Primitive : holding actual values
        int a = 77;
        int b = a;

        System.out.println("b before : " + b);

        a= 75;                                  // yukardaki kisimda degisiklik olmadi update edilmesine ragmen
        System.out.println("b after : " + b);

        // Reference : holding reference to their memory locations

        Person person1 = new Person();
        person1.firstName = "Techno";
        person1.lastName= "Study";
        person1.age = 2;

        Person person2 = person1;
        System.out.println("person2.age Before : " + person2.age);
        person1.age = 5;                    // person 1 update ettik ama person 2 da update etti
        System.out.println("person2.age After  : " + person2.age);


    }
}
