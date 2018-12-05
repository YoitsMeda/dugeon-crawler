package main.objects;

import java.util.ArrayList;
import java.util.List;

public abstract class Character extends Object implements CharacterInterface
{
    protected int level;
    protected int health;
    protected int magic;
    protected int strenght;
    protected int intelligence;
    protected int dexterity;
    protected int luck;
    protected String classname;

    protected int experience;


    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getHealth()
    {
        return health;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getMagic()
    {
        return magic;
    }
    public void setMagic(int magic)
    {
        this.magic = magic;
    }
    public int getStrenght()
    {
        return strenght;
    }
    public void setStrenght(int strenght)
    {
        this.strenght = strenght;
    }
    public int getIntelligence()
    {
        return intelligence;
    }
    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }
    public int getDexterity()
    {
        return dexterity;
    }
    public void setDexterity(int dexterity)
    {
        this.dexterity = dexterity;
    }
    public int getLuck()
    {
        return luck;
    }
    public void setLuck(int luck)
    {
        this.luck = luck;
    }

    public Character()
    {
        super();
        DiceBag characterCreationDiceBag = DiceBag.getCharacterCreationDiceBag();
        this.health = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.magic = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.strenght = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.intelligence = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.dexterity = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.luck = Die.rollDice(characterCreationDiceBag.getDiceInBag());
        this.level = 1;
    }

    public Character(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int level)
    {

        this.health = health;
        this.magic = magic;
        this.strenght = strenght;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.luck = luck;
        this.level = level;
    }

    public DiceBag getCharacterAttackDiceBag()
    {
        DiceBag characterAttackDiceBag = new DiceBag();

        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(20));
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

        return defense;
    }

}//End Class
