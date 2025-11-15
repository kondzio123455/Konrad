// Simple driver to demonstrate vaccinating a dog and a cat
public class vetDriver 
{
    public static void main(String[] args) 
    {
        // Create a Dog and Cat
        dog myDog = new dog("Golden Retriever", 3, 'M');
        Cat myCat = new Cat("norwedgian forest cat", 2, 'm');
        
        // Create a Vet object
        vet vet = new vet("jeff");
        
        // Call vaccinate method for both dog and cat
        vet.vaccinate(myDog);
        System.out.println(); // Add spacing
        vet.vaccinate(myCat);
    }
}
