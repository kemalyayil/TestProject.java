package Day45;

public class StringBufferDemo {
    public static void main(String[] args) {

        // Thread-Safe - Synchronized
        // They are mutable means changeable
        StringBuffer str = new StringBuffer("TechnoStudy");

        str.append(" - Java");           // does not create a new object
        System.out.println(str);

        String converted = str.toString();


    }
    }

