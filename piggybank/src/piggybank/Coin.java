package piggybank;

public abstract class Coin
{
    int value;
    double total;
    String name;

    public Coin(int value, String name, double total)
    {
        this.value = value;
        this.name = name;
        this.total = total;
    }
    //default contructor set to 1
    public Coin()
    {
        value = 1;
    }
    //add value
    public void addValue()
    {
        value = value + value;
    }
    // return the value * total
    public double totalValue()
    {
        return total * value;
    }

    public String getName()
    {
        return name;
    }
}