package Epam;

public class candy extends sweets
{
    public candy(String name, int quantity)
    {
        super(name,quantity);
        if(name.equals("eclairs"))
        {
            weight = 2.3;
        }
        else if(name.equals("mazelo"))
        {
            weight = 1;
        }
        else if(name.equals("alpenlibe"))
        {
            weight = 3;
        }
    }
}
