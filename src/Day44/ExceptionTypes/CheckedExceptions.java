package Day44.ExceptionTypes;

import java.io.FileInputStream;
import java.io.FileReader;

public class CheckedExceptions extends Throwable {
    public static void main(String[] args) {
        // Checked exceptions are giving compiler error. Altcizgili oluyor. islem yaptirmiyor. ama unchecked exceptions
        // alt cizgili gorunmuyor, compiler error vermiyor. run ettigimizde  hata veriyor


        //FileReader file = new FileReader("ExampleFile.txt");    // ilk etapta FileReader kirmizi cizgiliydi. neden?
                                                                            // cunku oyle bi dosya yok.(File not found Exception)




        try {
            FileReader file = new FileReader("ExampleFile.txt");        // bu exception in amaci program crash etmesin diye.
        }catch (Exception ex){
            System.out.println("There is no such file");
        }


    }
}
