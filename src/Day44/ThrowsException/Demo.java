package Day44.ThrowsException;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        Account account = new Account();
        try {
            account.deposit(-5);
        } catch (IOException e) {
            System.out.println ("You can not deposit negative numbers");
        }
    }
}
