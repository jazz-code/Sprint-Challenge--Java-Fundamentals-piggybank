package piggybank;

public class Dollar extends Coin
{
    
    //constructor with super() to get from Coin class
    public Dollar(int value)
    {
        super(value, "Dollar", 1.00);
    }

    //piggybank/Main.java:10: error: constructor Quarter in class Quarter cannot be applied to given types;
    public Dollar()
    {
        super(1, "Dollar", 1.00);
    }


   
}