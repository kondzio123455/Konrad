// this class represents an employee in the company
public final class employee {

    // instance variables
    private String empType = "manager";          // type of employee (manager or staff)
    private String comCarType;                   // company car type if manager
    private String fname;                        // first name
    private String lname;                        // last name
    public address address1;                     // address object (aggregation)
    private int employeeNumber;                  // unique id for each employee

    // static variable to track the next available employee number
    private static int nextEmployeeNumber = 1000;

    // constructor  creates a new employee and assigns an automatic employee number
    employee(String fname, String lname, address address1, String empType) {
        this.employeeNumber = nextEmployeeNumber;  // assign next available employee number
        nextEmployeeNumber++;                      // increase for the next employee
        setFname(fname);                           // set first name
        setLname(lname);                           // set last name
        setAddress1(address1);                     // set address
        setEmpType(empType);                       // set employee type

        // if the employee is a manager, allow setting company car
        if ("manager".equals(empType)) {
            setComCarType(comCarType);
        }
        // otherwise make sure the employee type is set to staff
        else {
            setEmpType("staff");
        }
    }

    // getter for first name
    public String getFname() {
        return fname;
    }

    // setter for first name
    public void setFname(String fname) {
        this.fname = fname;
    }

    // getter for last name
    public String getLname() {
        return lname;
    }

    // setter for last name
    public void setLname(String lname) {
        this.lname = lname;
    }

    // getter for address
    public address getAddress1() {
        return address1;
    }

    // setter for address
    public void setAddress1(address address1) {
        this.address1 = address1;
    }

    // getter for employee number
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // setter for employee number 
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // getter for employee type
    public String getEmpType() {
        return empType;
    }

    // setter for employee type
    public void setEmpType(String empType) {
        this.empType = empType;
    }

    // getter for company car type
    public String getComCarType() {
        return comCarType;
    }

    // setter for company car type
    public void setComCarType(String comCarType) {
        this.comCarType = comCarType;
    }

    // static method to get the next available employee number
    public static int getNextEmployeeNumber() {
        return nextEmployeeNumber;
    }

    // method to get how many employees have been created so far
    public int noOfEmployees() {
        return nextEmployeeNumber - 1000;
    }

    // toString method - returns all details of the employee as a string
    @Override
    public String toString() {
        return "employee [employeeNumber=" + employeeNumber
                + ", fname=" + fname
                + ", lname=" + lname
                + ", empType=" + empType
                + ", comCarType=" + comCarType
                + ", address=" + address1 + "]";
    }
}

