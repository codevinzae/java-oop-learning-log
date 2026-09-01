
public class YourFirstAccount {

    public static void main(String[] args) {
       Account vinzAccount = new Account("Vinz", 100.00);
       System.out.println("Initial state");
       System.out.println(vinzAccount);

        //the part where I got confused is that .balance()- in Account.java [to return the balance I need to call the .salvo()]
       vinzAccount.deposit(20);
       System.out.println("The balance of Vinz's Account is now: " + vinzAccount.saldo());

       System.out.println("End state");
       System.out.println(vinzAccount);
    }
}
