package Day37.EncapsulationTask.Task1Pack;

public class DemoAccount {
    public static void main(String[] args) {

        Account account = new Account("1532456424");

        String userId = account.getUserID();
        System.out.println("userId = " + userId);

        account.setBalance(1234567);
        Double balance = account.getBalance();
        System.out.println("balance = " + balance);

        Account account1 = new Account("3453452");
//        account1.setBalance(-5000);
//        System.out.println(account1.getBalance());
    }
}
