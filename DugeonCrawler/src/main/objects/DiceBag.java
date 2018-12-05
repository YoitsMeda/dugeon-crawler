package main.objects;

import java.util.ArrayList;
import java.util.List;

public class DiceBag
{
    private List<Die> diceInBag;


    public List<Die> getDiceInBag()
    {
        return diceInBag;
    }

    public void setDiceInBag(List<Die> diceInBag)
    {
        this.diceInBag = diceInBag;
    }

    public DiceBag() {} //default constructor

    public DiceBag(List<Die> diceInBag) //full param constructor
    {
        this.diceInBag = diceInBag;
    }

    public static DiceBag getCharacterCreationDiceBag()
    {
        DiceBag characterCreationDiceBag = new DiceBag();
        {
            List<Die> dice = new ArrayList<Die>();
            for(int i = 0; i < 3; i++)
            {
                dice.add(new Die(6));
            }
            characterCreationDiceBag.setDiceInBag(dice);
        }

        return characterCreationDiceBag;
    }

}
