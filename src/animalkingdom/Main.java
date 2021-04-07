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
    }
}