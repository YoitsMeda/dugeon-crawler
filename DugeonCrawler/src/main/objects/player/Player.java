package main.objects.player;

import main.objects.Character;

public  abstract class Player extends Character
{

    public Player()
    {
        super();

    }

    public Player(int health, int magic, int strenght, int intelligence, int dexterity, int luck, int level)
    {
        super(health, magic, strenght, intelligence, dexterity, luck, level);

    }

}
