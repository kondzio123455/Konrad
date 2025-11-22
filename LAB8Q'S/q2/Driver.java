public class Driver {
    public static void main(String[] args) {
        // Create a polymorphic array
        Person[] people = new Person[2];
        people[0] = new Employee("rob", 500300);
        people[1] = new Student("Bob", "vet");

        // Print name and description of each element
        for (Person p : people) {
            System.out.println(p.getName() + ": " + p.getDescription());
        }
    }
}
