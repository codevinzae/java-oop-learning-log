
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.0);

        System.out.println("Initial state");
        System.out.println(matthewAccount);
        System.out.println(myAccount);

        matthewAccount.withdrawal(100.00);
        System.out.println("The balance of Matthews account is now: " + matthewAccount.balance());
        myAccount.deposit(100.00);
        System.out.println("The balance of My account is now: " + myAccount.balance());

        System.out.println("End state");
        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}
