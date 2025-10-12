public class interestTest {
    public static void main(String[] args) {
        // Set initial annual interest rate to 4%
        Interest.modifyInterestRate(0.04);

        Interest saver1 = new Interest(2000.00);
        Interest saver2 = new Interest(3000.00);

        // calculate and display monthly interest for both savers for the first month
        System.out.printf("Month 1:\n");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1  (Account %d) Balance: %.2f\n", saver1.getAccountNumber(), saver1.getSavingsBalance());
        System.out.printf("Saver 2  (Account %d) Balance: %.2f\n", saver2.getAccountNumber(), saver2.getSavingsBalance());

        // change annual interest rate to 5%
        Interest.modifyInterestRate(0.05);

        // calculated and display monthly interest for both savers for the second month
        System.out.printf("\nMonth 2:\n");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 (Account %d) Balance: %.2f\n", saver1.getAccountNumber(), saver1.getSavingsBalance());
        System.out.printf("Saver 2 (Account %d) Balance: %.2f\n", saver2.getAccountNumber(), saver2.getSavingsBalance());
    }
}
