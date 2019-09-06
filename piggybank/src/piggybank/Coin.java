package piggybank;

public abstract class Coin
{
    int value;
    double total;

    public Coin(int value, double total)
    {
        this.value = value;
        this.total = total;
    }
    //default contructor set to 1
    public Coin()
    {
        value = 1;
    }
    //add value
    public void added()
    {
        value = value + value;
    }
    // return the value * total
    public int totalValue()
    {
        return value * total;
    }
}