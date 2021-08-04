package Day44.MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleException {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("Example.txt");
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("This file doesn't exist");
        } catch (IOException e) {   // line 12 de bulunan read de kirmizi cizgi vardi. bu exception onun icin...
            System.out.println("Not able to read");     // catch lerin sirasi bazen onemli . line 15 tekininin yerini line 13 teki ile
                                                        // degistirince kirmizi cizgili olup hata veriyor.
        }


    }
}
