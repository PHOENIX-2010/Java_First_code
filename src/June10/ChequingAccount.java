package June10;

public class ChequingAccount extends BankAccount{

    public ChequingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double deposit(double amount) {
        balance = balance + (0 * amount);
        return balance;
    }

    @Override
    double withdraw(double amount) {
        balance = balance + (0 * amount);
        return balance;
    }
}
