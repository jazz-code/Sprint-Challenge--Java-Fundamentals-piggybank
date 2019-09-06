package piggybank;

public class Dime extends Coin
{
    public Dime(int value)
    {
        super(value, "Dime", 0.10);
    }

    public Dime()
    {
        super(1, "Dime", 0.25);
    }
}