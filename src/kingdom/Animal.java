package kingdom;

public abstract class Animal
{
    protected int id;
    protected static int maxId =0;
    protected String name;
    protected int yearNamed;
    abstract String move();
    abstract String breathe();
    abstract String reproduce();
    
    public Animal(String name, int yearNamed)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public String getName()
    {
        return name;
    }
    public int getYearNamed()
    {
        return yearNamed;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setYearNamed(int yearNamed)
    {
        this.yearNamed = yearNamed;
    }


    @Override
    public String toString()
    {
        return "Id :"+ id +" Name: "+ name +" Year Named: "+ yearNamed+ "\n";
    }
}


class Mammal extends Animal
{
    public Mammal(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live birth";
    }
}

class Birds extends Animal
{
    public Birds(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "lays eggs";
    }
}

class Fish extends Animal
{
    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "lays eggs";
    }
}
