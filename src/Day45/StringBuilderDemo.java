package Day45;

public class StringBuilderDemo {
    public static void main(String[] args) {

        // Not Thread-safe
        // They are mutable, means changeable
        StringBuilder str = new StringBuilder("TechnoStudy");
        str.append(" - Java");

        System.out.println(str);

        String converted = str.toString();

        /*
         string builder is synchronized. thread-safe programs. threads are executing the programs. thread-safe means
         only one thread will be executed. multi-thread oldugu zaman coklu run olabilir. mesala facebook accaount icin
         bir cok kisi girebilir. kimse sira beklemez. String Buffer ise multi-thread sistemi ile calisir. Bu yuzden
         StringBuffer - StringBuilder a gore daha yavastir.
         */
    }

}
