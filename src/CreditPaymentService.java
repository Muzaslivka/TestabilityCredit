public class CreditPaymentService {

    public int calculation(int amountCredit, int amountYear) {
        double monthlyRate = 9.99 / 12 / 100; // ПС – месячная ставка по займу в долях от единицы, которая вычисляется по формуле: годовая ставка / 12 мес. / 100,
        //System.out.println(monthlyRate);

        double amountMonth = amountYear * 12; // n – срок кредита (в месяцах).
        // System.out.println(amountMonth);

        double i = monthlyRate + 1; // (1 + ПС)
        // System.out.println(i);

        double b = Math.pow(i, amountMonth); //(1 + ПС)ⁿ
        // System.out.println(b);

        int payment = (int) (amountCredit * monthlyRate * b / (b - 1)); // формула ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1)
        // System.out.println(payment);
        return payment;
    }
}
