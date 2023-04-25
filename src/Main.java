public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000; //С – сумма займа,
        int amountYear = 3;
        int monthPayment = service.calculation(amountCredit, amountYear);
        System.out.println(monthPayment);

    }
}