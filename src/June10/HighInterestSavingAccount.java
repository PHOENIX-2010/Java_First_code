package June10;

public class HighInterestSavingAccount extends BankAccount{

    public HighInterestSavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double deposit(double amount) {
        balance = balance + (1.2 * amount);
        return balance;
    }

    @Override
    double withdraw(double amount) {
        balance = balance + (1.2 * amount);
        return balance;
    }
}
