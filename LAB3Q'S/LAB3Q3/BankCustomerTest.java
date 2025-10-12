public class BankCustomerTest {
    public static void main(String[] args) {
        //bank customer
        Bank customer1 = new Bank("konrad skoczylas", "123 Main St");

        // 3 savings accounts balances only
        customer1.addAccount(500.0);
        customer1.addAccount(1200.0);
        customer1.addAccount(300.0);
        customer1.addAccount(100.0); // this one should not be added limit = 3

        customer1.summary();

        // Show total balance
        System.out.println("Total balance for " + customer1.getName() + ": " + customer1.balance());
    }
}