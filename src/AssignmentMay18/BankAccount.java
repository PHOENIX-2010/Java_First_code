package AssignmentMay18;

public class BankAccount {

    String accountholdername;
    String accountnumber;
    double balance;

    public BankAccount(String accountholdername, String accountnumber, double balance) {
        this.accountholdername = accountholdername;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public BankAccount(String accountholdername, String accountnumber) {
        this.accountholdername = accountholdername;
        this.accountnumber = accountnumber;
    }

    public void deposit(double amount){
        if (amount>0){
            balance = balance + amount;
            System.out.println("Deposit amount: $" +balance);
        }else {
            System.out.println("Invalid entry");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance = balance - amount;
            System.out.println("Withdraw amount: $" +balance);
        } else {
            System.out.println("Invalid entry");
        }
    }

    public void displayaccountinfo(){
        System.out.println("Account Holder Name:" + accountholdername);
        System.out.println("Account Number:" + accountnumber);
        System.out.println("Account Balance: $" + balance);
    }

    public static void main(String[] args) {

        BankAccount bankaccount = new BankAccount("Utsav Patel","AC215335", 2500.25);

        bankaccount.displayaccountinfo();
        bankaccount.deposit(200);
        bankaccount.withdraw(600.25);

        System.out.println("===================================");

        BankAccount bankAccount1 = new BankAccount("Dhruvi Patel", "AC250452");

        bankAccount1.displayaccountinfo();
        bankAccount1.deposit(500);
        bankAccount1.withdraw(350);
     }
}
