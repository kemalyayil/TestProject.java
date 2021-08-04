package Day21;

public class Task {

    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class Integer
    // input 2, output 4



        public static void main(String[] args) {

            twiceThatInt(2);

            Integer var = 5;

            twiceThatInt(var);
    }
    public static Integer twiceThatInt(int a){
        return a * 2;
    }
    public static Integer twiceThatInt(Integer a) {
        return a * 2;
    }

}
