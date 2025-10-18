import java.util.Scanner;

// main class for running the hr system
public class Hrtest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create scanner for user input

        // initialize 3 offices automatically
        offices office1 = new offices();
        offices office2 = new offices();
        offices office3 = new offices();

        // store all offices in an array
        offices[] officelist = {office1, office2, office3};

        // we can have a maximum of 5 employees
        employee[] emplist = new employee[5];
        int empcount = 0; // keeps track of how many employees exist

        int choice = 0; // stores user's menu choice

        // main menu loop
        while (choice != 4) {
            System.out.println("1. list all offices");
            System.out.println("2. create a new employee record");
            System.out.println("3. list all employees");
            System.out.println("4. exit");
            System.out.print("enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            // switch handles menu choices
            switch (choice) {

                // option 1: list all offices
                case 1 -> {
                    System.out.println("\n--- list of offices ---");
                    // loop through each office
                    for (offices of : officelist) {
                        // print basic office info
                        System.out.println(of + " | no. of employees: " + of.getNoOfEmps());
                        // if the office has employees, list them
                        if (of.getNoOfEmps() > 0) {
                            System.out.println(of.listEmployee());
                        }
                    }
                }

                // option 2: create a new employee
                case 2 -> {
                    if (empcount < 5) { // check if we can still create employees
                        // gather employee info
                        System.out.print("enter first name: ");
                        String fname = scanner.nextLine();

                        System.out.print("enter last name: ");
                        String lname = scanner.nextLine();

                        System.out.print("enter street: ");
                        String street = scanner.nextLine();

                        System.out.print("enter city: ");
                        String city = scanner.nextLine();

                        System.out.print("enter county: ");
                        String county = scanner.nextLine();

                        System.out.print("enter employee type (manager/staff): ");
                        String emptype = scanner.nextLine();

                        // create address object
                        address addr = new address(street, city, county);

                        // create employee
                        employee emp = new employee(fname, lname, addr, emptype);

                        // if employee is a manager, ask for company car
                        if (emptype.equalsIgnoreCase("manager")) {
                            System.out.print("enter company car type: ");
                            String car = scanner.nextLine();
                            emp.setComCarType(car);
                        }

                        // choose an office to assign employee
                        System.out.println("choose office (0, 1, or 2): ");
                        int offchoice = scanner.nextInt();
                        scanner.nextLine();

                        // check if valid office choice
                        if (offchoice >= 0 && offchoice < officelist.length) {
                            // try adding employee to that office
                            if (officelist[offchoice].addEmployee(emp)) {
                                emplist[empcount++] = emp;
                                System.out.println("employee added successfully");
                            } else {
                                System.out.println("office is full. try another office.");
                            }
                        } else {
                            System.out.println("invalid office choice");
                        }
                    } else {
                        System.out.println("you have created the maximum number of employees (5).");
                    }
                }

                // option 3: list all employees
                case 3 -> {
                    System.out.println("\n--- list of all employees ---");
                    for (int i = 0; i < empcount; i++) {
                        if (emplist[i] != null)
                            System.out.println(emplist[i]);
                    }
                    if (empcount == 0) {
                        System.out.println("no employees have been added yet.");
                    }
                }

                // option 4: exit program
                case 4 -> System.out.println("exiting system. goodbye!");

                // invalid input 
                default -> System.out.println("invalid choice! try again.");
            }
        }

        // close scanner
        scanner.close();
    }
}





