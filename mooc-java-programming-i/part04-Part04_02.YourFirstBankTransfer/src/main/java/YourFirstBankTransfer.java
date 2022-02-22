
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account adrianAccount = new Account("My account", 0.00);
        
        matthewsAccount.withdrawal(100.00);
        adrianAccount.deposit(100.00);
        System.out.println(adrianAccount);
        System.out.println(matthewsAccount);
    }
}
