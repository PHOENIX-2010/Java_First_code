package June10;

public abstract class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract double deposit(double amount);
        abstract double withdraw(double amount);

        public void displayBalance(){
            System.out.println("Account Number is: " +accountNumber);
            System.out.println("Account Balance is: $" +balance);
            System.out.println("After the deposit and withdraw amount is: $" +balance);
        }

}
