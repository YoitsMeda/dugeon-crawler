package main.objects.monster;

public class Skeleton extends Monster
{

    private int reanimate;















    public int getReanimate() {
        return reanimate;
    }




    public void setReanimate(int reanimate) {
        this.reanimate = reanimate;
    }




    public Skeleton()
    {
        super();
    }




    public Skeleton(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int level, int dropRate, String itemDrop, int expDropped)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level, dropRate, itemDrop, expDropped);
    }

}
