// this class represents an office in the company
public class offices {
    // static variable to automatically assign office numbers starting at 100
    private static int nextOffice = 100;

    // instance variables
    private int officeNumber;        // holds the number of this office
    private int noOfEmps = 0;        // tracks how many employees are in this office
    private employee[] employees = new employee[2]; // max of 2 employees per office

    // constructor - assigns the next available office number automatically
    public offices() {
        setOfficeNumber(nextOffice);
        nextOffice++;
    }

    // getter for office number
    public int getOfficeNumber() {
        return officeNumber;
    }

    // setter for office number
    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    // getter for number of employees in the office
    public int getNoOfEmps() {
        return noOfEmps;
    }

    // setter for number of employees (not often used manually)
    public void setNoOfEmps(int noOfEmps) {
        this.noOfEmps = noOfEmps;
    }

    // getter for the array of employees assigned to this office
    public employee[] getEmployees() {
        return employees;
    }

    // setter for replacing the entire employee array (rarely used)
    public void setEmployees(employee[] employees) {
        this.employees = employees;
    }

    // toString method - returns a readable string for printing the office
    @Override
    public String toString() {
        return "office number: " + officeNumber;
    }

    // method to add an employee to the office
    // returns true if added successfully, false if office is full
    public boolean addEmployee(employee employed) {
        if (noOfEmps < employees.length) {        // if space is available
            employees[noOfEmps] = employed;       // add employee to array
            noOfEmps++;                           // increase count
            return true;                          // confirm success
        } else {
            System.out.println("can't add more employees to this office."); 
            return false;                         
        }
    }

    // method to list all employees currently assigned to this office
    public String listEmployee() {
        String empList = "";                       // create empty string for results
        for (int i = 0; i < noOfEmps; i++) {       // loop through assigned employees
            // add employee details and address info to output
            empList += employees[i].toString() + " "+ employees[i].getAddress1().toString() + " "+ employees[i].getEmpType() + " "+ employees[i].getFname() + " "+ employees[i].getLname() + "\n";
        }
        return empList;                            // return list of employee info
    }
}





