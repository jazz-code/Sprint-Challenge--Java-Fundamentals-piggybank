package piggybank;

public class Penny extends Coin
{
    public Penny(int value)
    {
        super(value, "Penny", 0.10);
    }

    public Penny()
    {
        super(1, "Penny", 1.00);
    }
}