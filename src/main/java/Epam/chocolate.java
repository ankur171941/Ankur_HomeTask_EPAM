package Epam;

public class chocolate extends sweets
{
    public chocolate(String name, int quantity)
    {
        super(name, quantity);
        if(name.equals("munch"))
        {
            weight = 10.1;
        }
        else if(name.equals("snikker almonds"))
        {
            weight = 8.8;
        }
        else if(name.equals("kitkat"))
        {
            weight = 20.3;
        }
    }
}
