public class YourFirstAccount {

    public static void main(String[] args) {
        Account vinzAccount = new Account("Vinz", 100.00);
        vinzAccount.deposit(20.0);
        System.out.println(vinzAccount);
    }
}