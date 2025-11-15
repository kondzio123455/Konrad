// Cat: simple Animal specialization
public class Cat extends Animal 
{
    public Cat(String type, int age, char gender)
    {
        super(type, age, gender);
    }

    @Override
    public void eat()
    {
        System.out.print("\nCat is eating");
    }
    

    @Override
    public void sleep()
    {
        System.out.print("\nCat is sleeping");
    }
    

    @Override
    public void makeSound()
    {
        System.out.print("\nCat is making a sound");
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}