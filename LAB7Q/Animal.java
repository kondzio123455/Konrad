// Simple base class representing a generic animal
public class Animal 
{
    private String type;
    private int age;
    private char gender;

    public Animal()
    {
        setType("Unknown");
        setAge(0);
        setGender('U');
    }

    public Animal(String type, int age, char gender)
    {
        setType(type);
        setAge(age);
        setGender(gender);
    }
    
    // simple action: eat
    public void eat()
    {
        System.out.print("\nAnimal is eating");
    }
    
    // simple action: sleep
    public void sleep()
    {
        System.out.print("\nAnimal is sleeping");
    }
    
    // simple action: make a sound
    public void makeSound()
    {
        System.out.print("\nAnimal is making a sound");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // return a short multi-line description
    @Override
    public String toString()
    {
        return "\nType: " + getType() + "\nAge: " + getAge() + "\nGender: " + getGender();
    }
}

