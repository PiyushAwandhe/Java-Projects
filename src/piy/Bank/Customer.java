package piy.Bank;

public class Customer {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, "Piyush");
        account.deposit(1000);
        System.out.println(account.withdraw(500));
        account.deposit(1000);
        account.withdraw(500);
        System.out.printf("%s has ₹%f/- in his account" , account.getAccountHolder(),account.getBalance());
    }
}
