class Bank {
    private String name;
    private String address;
    private double[] savingsAccounts;
    private int accountCount;

    // Constructor only name and address
    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.savingsAccounts = new double[3]; // up to 3 savings accounts
        this.accountCount = 0;
    }

    //savings account, just the balance
    public void addAccount(double balance) {
        if (accountCount < 3) {
            savingsAccounts[accountCount] = balance;
            accountCount++;
            System.out.println("Account " + accountCount + " added with balance " + balance);
        } 
        else 
        {
            System.out.println("Cant add more than 3 savings accounts for " + name);
        }
    }

    // Computes the  total balance
    public double balance() {
        double total = 0;
        for (int i = 0; i < accountCount; i++) 
        {
            total += savingsAccounts[i];
        }
        return total;
    }

    public void summary() 
    {
        System.out.println("Customer " + name + " (" + address + ")");
        for (int i = 0; i < accountCount; i++) 
        {
            System.out.println("  Account  " + (i + 1) + "Balance " + savingsAccounts[i]);
        }
        System.out.println(" Total Balance " + balance());
    }

    public String getName() {
        return name;
    }
}