package Day29.ReferenceVsPrimitive;

public class _02_ReferenceVsPrimitiveInMethods {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before number : " + number);
        change(number);
        System.out.println("After number : " + number);


        Person person = new Person();
        person.age = 25;
        System.out.println("Before age : " + person.age);
        change(person);
        System.out.println("After age : " + person.age);
    }

        public static void change(int parameter){
            System.out.println("Once = " + parameter);
        parameter = parameter + 1;
            System.out.println("Sonra = " + parameter);
        }

        public static void change(Person parameter){

        parameter.age = parameter.age + 1;
        }


}
