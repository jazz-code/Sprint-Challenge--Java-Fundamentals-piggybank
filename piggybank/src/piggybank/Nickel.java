package piggybank;

public class Nickel extends Coin
{
    public Nickel(int value)
    {
        super(value, "Nickel", 0.10);
    }

    public Nickel()
    {
        super(1, "Nickel", 1.00);
    }
}