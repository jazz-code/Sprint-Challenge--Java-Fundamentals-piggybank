package piggybank;
import java.util.*;
public class Main {

    public static void main(String[] args) 
    {
        //initialize a double to hold total
        double total = 0;
        //make an array list
        ArrayList<Coin> myList = new ArrayList<Coin>();
        myList.add(new Quarter());

        myList.add(new Dime());

        // myList.add(new Dollar(5));

        // myList.add(new Nickel(3));

        // myList.add(new Dime(7));

        // myList.add(new Dollar());

        // myList.add(new Penny(10));

        
        //size + get are array methods in java
        for (int i = 0; i < myList.size(); i++)
        {
            total = total + myList.get(i).totalValue();
        }
        System.out.println(total);


    }
}