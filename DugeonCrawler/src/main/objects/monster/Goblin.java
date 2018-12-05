package main.objects.monster;

public class Goblin extends Monster
{

   private int clawAttack;
   private int biteAttack;
   private int rally;



    public int getClawAttack() {
    return clawAttack;
}

public void setClawAttack(int clawAttack) {
    this.clawAttack = clawAttack;
}

public int getBiteAttack() {
    return biteAttack;
}

public void setBiteAttack(int biteAttack) {
    this.biteAttack = biteAttack;
}

public int getRally() {
    return rally;
}

public void setRally(int rally) {
    this.rally = rally;
}

    public Goblin()
    {
        super();
    }

    public Goblin(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int level, int dropRate, String itemDrop, int expDropped)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level, dropRate, itemDrop, expDropped);
        // TODO Auto-generated constructor stub
    }

}
