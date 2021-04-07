package animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Animal> animalList = new ArrayList<>();

        //Mammals
        animalList.add(new Mammal("Panda", 1869));
        animalList.add(new Mammal("Zebra", 1778));
        animalList.add(new Mammal("Koala", 1816));
        animalList.add(new Mammal("Sloth", 1804));
        animalList.add(new Mammal("Armadillo", 1758));
        animalList.add(new Mammal("Raccoon", 1758));
        animalList.add(new Mammal("Bigfoot", 2021));

        //Birds
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1785));

        // Fish
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        System.out.println("\n***Animal List");
        System.out.println(animalList);

        System.out.println("\n*** Sort By Year (newest to oldest)");
        animalList.sort((a1, a2) -> (a1.getYearNamed()<a2.getYearNamed())? 1 :-1);
        System.out.println(animalList);

        System.out.println("\n*** Sort By Name (A-Z)");
        animalList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        System.out.println(animalList);

        System.out.println("\n*** Sort By Movement");
        animalList.sort((a1,a2)->  a1.move().compareTo(a2.move()));
        System.out.println(animalList);

        System.out.println("\n*** Sort by animals that breathe with lungs ***");
      
    }
}