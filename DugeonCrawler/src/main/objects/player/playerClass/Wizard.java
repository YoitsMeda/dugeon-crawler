package main.objects.player.playerClass;

import java.util.ArrayList;
import java.util.List;

import main.objects.DiceBag;
import main.objects.Die;
import main.objects.player.Player;

public class Wizard extends Player
{
    private int magicCrit;
    private int wisdom;






    public int getMagicCrit() {
        return magicCrit;
    }

    public void setMagicCrit(int magicCrit) {
        this.magicCrit = magicCrit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public Wizard()
    {
       super();
    }

    public Wizard(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int magicCrit, int wisdom, int level)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);
        this.magicCrit = magicCrit;
        this.wisdom = wisdom;

    }
    @Override
    public DiceBag getCharacterAttackDiceBag()
    {
        DiceBag characterAttackDiceBag = new DiceBag();

        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(25));
        characterAttackDiceBag.setDiceInBag(dice);

        return characterAttackDiceBag;
    }

    public int calulateDefense()
    {
        int defense = this.dexterity - 6;
        if(defense < 0)
        {
            defense = 0;
        }
        double additionalDefense = defense * wisdom;
        int additionalDefenseInt = (int)Math.round(additionalDefense + 0.5);
        defense = defense + additionalDefenseInt;

        return defense;
    }
}
