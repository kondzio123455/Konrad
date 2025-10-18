// this class represents an address for an employee
class address {

    // instance variables for street, city, and county
    private String street;
    private String city;
    private String county;

    // constructor - creates an address using three pieces of information
    public address(String street, String city, String county) {
        setStreet(street);   // set street value
        setCity(city);       // set city value
        setCounty(county);   // set county value
    }

    // getter for street
    public String getStreet() {
        return street;
    }

    // setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    // getter for city
    public String getCity() {
        return city;
    }

    // setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // getter for county
    public String getCounty() {
        return county;
    }

    // setter for county
    public void setCounty(String county) {
        this.county = county;
    }

    // toString method - returns the address details as a readable string
    @Override
    public String toString() {
        return "address [street=" + street + ", city=" + city + ", county=" + county + "]";
    }
}
