package piggybank;

public class Quarter extends Coin
{
    private int value;

    public Quarter(int value)
    {
        super(value, "Quarter", 0.25);
    }

    ////piggybank/Main.java:10: error: constructor Quarter in class Quarter cannot be applied to given types;
    // needs a default value ^^^
    public Quarter()
    {
        super(1, "Quarter", 0.25);
    }
}