package main.objects.player.playerClass;

import java.util.ArrayList;
import java.util.List;

import main.objects.DiceBag;
import main.objects.Die;
import main.objects.player.Player;

public class Warrior extends Player
{
    private double resilience;



    public double getResilience() {
        return resilience;
    }

    public void setResilience(double resilience) {
        this.resilience = resilience;
    }

    public Warrior()
    {
        super();
        DiceBag characterCreationDiceBag = DiceBag.getCharacterCreationDiceBag();
        this.health = Die.rollDice(characterCreationDiceBag.getDiceInBag()) + 3;
        this.resilience = Die.rollDice(characterCreationDiceBag.getDiceInBag());
    }

    public Warrior(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int resilience, int level)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);
        this.resilience = resilience;
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

    public int calculateDefense()
    {
        int defense = this.dexterity - 5;

        if(defense < 0)
        {
            defense = 0;
        }
        double additionalDefense = defense * resilience;
        int additionalDefenseInt = (int)Math.round(additionalDefense + 0.5); //always round up (.5 does that)
        defense = defense + additionalDefenseInt;

        return defense;
    }
}//END CLASS
