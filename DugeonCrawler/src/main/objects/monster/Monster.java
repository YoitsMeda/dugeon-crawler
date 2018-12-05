package main.objects.monster;

import main.objects.Character;

public abstract class Monster extends Character

{
    protected String itemDrop;
    protected int dropRate;


    public String getItemDrop() {
        return itemDrop;
    }

    public void setItemDrop(String itemDrop) {
        this.itemDrop = itemDrop;
    }

    public int getDropRate() {
        return dropRate;
    }

    public void setDropRate(int dropRate) {
        this.dropRate = dropRate;
    }

    public Monster()
    {
        super();
    }

    public Monster(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int level, int dropRate, String itemDrop, int expDropped)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);
        this.itemDrop = itemDrop;
        this.dropRate = dropRate;
    }

}//END CLASS
