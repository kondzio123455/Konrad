// dog: simple Animal specialization (note: class name intentionally lowercase)
public class dog extends Animal 
{
    public dog(String type, int age, char gender)
    {
        super(type, age, gender);
    }

    @Override
    public void eat()
    {
        System.out.print("\nDog is eating");
    }
    
    @Override
    public void sleep()
    {
        System.out.print("\nDog is sleeping");
    }
    
    @Override
    public void makeSound()
    {
        System.out.print("\nDog is making a sound");
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
