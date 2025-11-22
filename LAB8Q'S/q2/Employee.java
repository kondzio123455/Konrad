class Employee extends Person {
    private double annualSalary;

    // Constructor
    public Employee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    // Implement abstract method
    @Override
    public String getDescription() {
        return "An employee with a salary of " + annualSalary;
    }
}