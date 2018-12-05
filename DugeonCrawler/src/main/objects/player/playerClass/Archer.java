package main.objects.player.playerClass;

import java.util.ArrayList;
import java.util.List;

import main.objects.DiceBag;
import main.objects.Die;
import main.objects.player.Player;

public class Archer extends Player
{
    private int range;
    private int dodge;
    private int crit;



    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Archer()
    {
        // TODO Auto-generated constructor stub
    }

    public Archer(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int range, int level)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);
        this.range = range;
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
