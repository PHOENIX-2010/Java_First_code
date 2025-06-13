package June10;

public class SavingAccount extends BankAccount{

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
     double deposit(double amount) {
        balance = balance + (2.5 * amount);
        return balance;
    }

    @Override
     double withdraw(double amount) {
        balance = balance + (2.5 * amount);
        return balance;
    }
}
