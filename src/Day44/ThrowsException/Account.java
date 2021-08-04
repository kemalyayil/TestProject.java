package Day44.ThrowsException;

import java.io.IOException;

public class Account {
    public void deposit (double moneyToDeposit) throws IOException{         // throws key word is important. it means that
        if (moneyToDeposit <= 0)                                    // that might give an exception
            throw new IOException();

    }
}
