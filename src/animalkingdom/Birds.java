package animalkingdom;

public class Birds extends Animal
{
    public Birds (String name, int yearNamed)
    {
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
