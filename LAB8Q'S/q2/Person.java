// Abstract class Person
abstract class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Concrete method
    public String getName() {
        return name;
    }

    // Abstract method
    public abstract String getDescription();
}