public class Interest {
    private static double annualInterestRate;
    

    private static int nextAccountNumber = 1; 
    
    // Private instance variables
    private double savingsBalance; 
    private final int accountNumber; 
    public Interest(double initialBalance) {
        this.savingsBalance = initialBalance;
        // assign current nextAccountNumber and then increment it for the next account
        this.accountNumber = nextAccountNumber++; 
    }

    public void calculateMonthlyInterest() {
        // Monthly interest (Balance * Annual Rate) / 12
        double monthlyInterest = (this.savingsBalance * annualInterestRate) / 12.0;
        this.savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Getter method for the savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    // Getter method for the account number
    public int getAccountNumber() {
        return accountNumber;
    }
}