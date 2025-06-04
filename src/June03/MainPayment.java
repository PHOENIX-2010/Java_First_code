package June03;

public class MainPayment {
    public static void main(String[] args) {

        Payment applepay = new ApplePay();
        applepay.pay();

        System.out.println("==============================");

        Payment debitcard = new DebitCard();
        debitcard.pay();

        System.out.println("==============================");

        Payment paypal = new Paypal();
        paypal.pay();

        System.out.println("==============================");

        Payment creditcard = new CreditCard();
        creditcard.pay();
    }
}
