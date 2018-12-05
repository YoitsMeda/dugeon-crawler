package main.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import main.objects.Dungeon;
import main.objects.monster.Dragon;
import main.objects.monster.Monster;
import main.objects.player.Player;
import main.objects.player.playerClass.Archer;
import main.objects.player.playerClass.Rogue;
import main.objects.player.playerClass.Warrior;
import main.objects.player.playerClass.Wizard;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        try
        {
      //menu: start menu
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String welcomeMessage = "DUNGEON CRAWLER \r\n" +
                                    "Start game? Y/N";
            System.out.println(welcomeMessage);
            String userInput = bufferedReader.readLine();
            switch(userInput)
            {
            case "Y":
                //start game
                Main.newScreen();
                //menu: create character
                // create a new instance of the Player class
                Player player = null;

                System.out.println("What is your class?");
                String createCharacterUserInputClass = bufferedReader.readLine();

                Random rand = new Random();
                int diceRoll = 0;
                String playerClass = "";
                switch (createCharacterUserInputClass)
                {
                case "Warrior":
                case "warrior":
                case "war":
                case "War":
                    Warrior warrior = new Warrior();
                    player = (Player)warrior;

                    break;

                case "Wizard":
                case "wizard":
                case "Wiz":
                case "wiz":
                    Wizard wizard = new Wizard();
                    diceRoll = rand.nextInt(50) + 1;
                    wizard.setHealth(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    wizard.setMagic(diceRoll);
                    diceRoll = rand.nextInt(50) + 10;
                    wizard.setStrenght(diceRoll);
                    diceRoll = rand.nextInt(50) - 2;
                    wizard.setDexterity(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    wizard.setIntelligence(diceRoll);
                    diceRoll = rand.nextInt(50) + 5;
                    wizard.setLuck(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    wizard.setMagicCrit(diceRoll);
                    /* diceRoll.....Need to figure out how to me an if statement for the chance if higher than this then true if not fasle and fail
                     * Need to make a function or class for critcal for all classes mayeb in the Character File
                     */
                    player = (Player)wizard;

                    //save class wizard to player class
                   break;

                case "Archer":
                case "archer":
                case "arc":
                case "Arc":
                    Archer archer = new Archer();
                    diceRoll = rand.nextInt(50) + 1;
                    archer.setHealth(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    archer.setMagic(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    archer.setStrenght(diceRoll);
                    diceRoll = rand.nextInt(50) + 2;
                    archer.setDexterity(diceRoll);
                    diceRoll = rand.nextInt(50) + 5;
                    archer.setIntelligence(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    archer.setLuck(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    archer.setCrit(diceRoll);

                    // Make a crit function or method for all class to pull for on this stat yes or no check greater than 20 and up depends on the crit so the higher
                    // it is the more the crit.c
                    player = (Player)archer;

                case "Rogue":
                case "rogue":
                case "rog":
                case "Rog":
                    Rogue rogue = new Rogue();
                    diceRoll = rand.nextInt(50) + 1;
                    rogue.setHealth(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    rogue.setMagic(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    rogue.setStrenght(diceRoll);
                    diceRoll = rand.nextInt(50) + 2;
                    rogue.setDexterity(diceRoll);
                    diceRoll = rand.nextInt(50) + 5;
                    rogue.setIntelligence(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    rogue.setLuck(diceRoll);
                    diceRoll = rand.nextInt(50) + 1;
                    rogue.setCrit(diceRoll);
                    //save class rogue to play class

                    break;
                default:
                    //**PRACTICE LAB - recreate the switch logic, but not using a switch
                    switch(rand.nextInt(4))
                    {
                    case 0:
                        //TODO create warrior
                        break;
                    case 1:
                        //TODO create wiz
                        break;
                    case 2:
                        //TODO create archer
                        break;
                    case 3:
                        //TODO create rogue
                        break;
                    }
                }

                //name
                String createCharacterUserInputName = bufferedReader.readLine();
                // Save name to Player class

             // enter dungeon'
                // create instance of the dungeon class
                Dungeon dungeon = new Dungeon();
                dungeon.setNumberOfRooms(10);
                dungeon.setName("Casear's Place");
                dungeon.setEnviromentType("Train");

                String dungeonName = dungeon.getName();
                //room number
                //name
                //enviromentType

            //enter room
                // create a new instance of the Room class
                //type
                //description

                //Scenario: monster encounter
                    //randomly generate mob (lvl 1-5)
                Monster monster = new Dragon();

                    //combat win
                        //enter room
                    //combat lose
                        //death
                //Scenario: chest encounter
                    //find weapon
                        //ask user Y/N
                            //y - save new
                            //n - no action (keep old)
                        //enter room
                    //find armor
                        //ask user Y/N
                            //y - save new
                            //n - no action (keep old)
                        //enter room
                    //find key
                        //fight boss
                //Scenario: trap room
                    //death
                //Scenario: fight boss
                    //combat win
                        //win!
                            //start
                    //combat lose
                        //death

                break;

            case "N":
                //exit app
                break;

            }


        }
        catch(Exception exception)
        {
            //TODO: Deal with error
        }

    }//END main()

    private static void newScreen()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}//END class
