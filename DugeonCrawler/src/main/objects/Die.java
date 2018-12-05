package main.objects;

import java.util.List;
import java.util.Random;

public class Die
{
    public final Random randomInt = new Random();

    public int numberOfSides;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    //example of instanced method because it uses the fields!
    public int rollDie()
    {
        return randomInt.nextInt(numberOfSides) + 1;
    }

    //example of static method because it doesn't need data from fields! (may use variables that act like constants (have final))
    public static int rollDice(List<Die> dice)
    {
        int total = 0;
        for (Die die : dice)
        {
            total += die.rollDie();
//          total = total + die.rollDie(); does the same as the code above, and easier to read
        }

        return total;
    }


    public Die() {}//default constructor

    public Die(int numberOfSides)//full param constructor
    {
        this.numberOfSides = numberOfSides;
    }

}
