// vet: small class that can vaccinate animals
public class vet 
{
    private String name;

    public vet()
    {
        setName("Unknown");
    }

    public vet(String name)
    {
        setName(name);
    }
    
    // vaccinate prints the action and the animal details
    public void vaccinate(Animal animal)
    {
        System.out.print("\n" + getName() + " is vaccinating.");
        if(animal instanceof dog)
        {
            System.out.print("\nDog has been vaccinated: " + animal.toString());
        }
        else if (animal instanceof Cat)
        {
            System.out.print("\nCat has been vaccinated: " + animal.toString());
        }
        else 
        {
            System.out.print("\nAnimal has been vaccinated: " + animal.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

