package main.objects.player.playerClass;

import java.util.ArrayList;
import java.util.List;

import main.objects.DiceBag;
import main.objects.Die;
import main.objects.player.Player;

public class Bard extends Player
{
    private int range;
    private int hymnOfSleep;
    private int hymnOfPower;
    private int hymnOfEnduring;
    private int hymnOfDexterity;
    private int hymnOfLuck;
    private int hymnOfFury;
    private int dodge;
    private int crit;



    public int getDodge() 
    {
        return dodge;
    }

    public void setDodge(int dodge) 
    {
        this.dodge = dodge;
    }

    public int getCrit() 
    {
        return crit;
    }

    public void setCrit(int crit) 
    {
        this.crit = crit;
    }

    public int getRange() 
    {
        return range;
    }

    public void setRange(int range) 
    {
        this.range = range;
    }
    
    public int getHymnOfSleep() 
    {
        return hymnOfSleep;
    }

    public void setHymnOfSleep(int hymnOfSleep) 
    {
        this.hymnOfSleep = hymnOfSleep;
    }
    
    public int getHymnOfPower() 
    {
        return hymnOfPower;
    }

    public void setHymnOfPower(int hymnOfPower) 
    {
        this.hymnOfPower = hymnOfPower;
    }

    public int getHymnOfEnduring() 
    {
        return hymnOfEnduring;
    }

    public void setHymnOfEnduring(int hymnOfEnduring) 
    {
        this.hymnOfEnduring = hymnOfEnduring;
    }
    
    public int getHymnOfDexterity() 
    {
        return hymnOfDexterity;
    }

    public void setHymnOfDexterity(int hymnOfDexterity) 
    {
        this.hymnOfDexterity = hymnOfDexterity;
    }
    
    public int getHymnOfLuck() 
    {
        return hymnOfLuck;
    }

    public void setHymnOfLuck(int hymnOfLuck) 
    {
        this.hymnOfLuck = hymnOfLuck;
    }
    
    public int getHymnOfFury() 
    {
        return hymnOfFury;
    }

    public void setHymnOfFury(int hymnOfFury) 
    {
        this.hymnOfFury = hymnOfFury;
    }


    public Bard()
    {
        // TODO Auto-generated constructor stub
    }

    public Bard(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int range, int level)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);
        this.range = range;
    }
    @Override
    public DiceBag getCharacterAttackDiceBag()
    {
        
        // Need to add logic for the Hymns that effect the dice rolls and how they will play into the attacks and or add extra dice rolls. 
        DiceBag characterAttackDiceBag = new DiceBag();

        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(25));
        characterAttackDiceBag.setDiceInBag(dice);
        return characterAttackDiceBag;
    }

    public int calculateDefense()
    {
        int defense = this.dexterity + 5;
        if(defense < 0)
        {
            defense = 0;
        }
        double dodge = defense + this.dexterity * 0.3;
        int dodgeInt = (int)(Math.round(dodge + 0.5));
        defense = defense + dodgeInt;

        return defense;

    }
}
