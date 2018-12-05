package main.objects.player.playerClass;

import java.util.ArrayList;
import java.util.List;

import main.objects.DiceBag;
import main.objects.Die;
import main.objects.player.Player;

public class Rogue extends Player
{
    private int crit;
    private int dodge;
    private int steal;




    public int getSteal() {
        return steal;
    }

    public void setSteal(int steal) {
        this.steal = steal;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public Rogue()
    {
        super();
        DiceBag characterCreationDiceBag = DiceBag.getCharacterCreationDiceBag();
        this.health = Die.rollDice(characterCreationDiceBag.getDiceInBag()) + 3;
        this.crit = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.dodge = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.steal = Die.rollDice(characterCreationDiceBag.getDiceInBag());

    }

    public Rogue(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int crit, int dodge, int level, int steal)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);
        this.crit = crit;
        this.dodge = dodge;
        this.steal = steal;
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
