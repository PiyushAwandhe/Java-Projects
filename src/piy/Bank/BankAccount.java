package piy.Bank;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    public void deposit(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit");
        }else{
            balance += money;
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public double withdraw(double money) {
        if (money <= 0 || money > balance) {
            System.out.println("Invalid Withdrawal");
        }else{
            balance -= money;
        }

        return money;
    }
}
