package June10;

public class MainBankAccount {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount("AC123789", 2500);
        sa.deposit(500);
        sa.withdraw(0);
        sa.displayBalance();

        System.out.println("=======================================");

        ChequingAccount ca = new ChequingAccount("AC456123", 1000);
        ca.deposit(300);
        ca.withdraw(100);
        ca.displayBalance();

        System.out.println("=======================================");

        HighInterestSavingAccount highInterestSavingAccount = new HighInterestSavingAccount("AC252800", 4200);
        highInterestSavingAccount.deposit(200);
        highInterestSavingAccount.withdraw(50);
        highInterestSavingAccount.displayBalance();

    }
}
