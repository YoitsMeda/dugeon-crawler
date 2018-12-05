package main.objects.example;

public class Unicycle extends Cycle
{
 // fields
    public Unicycle()
    {
        super();
    }
    // the Bicycle class has
    // one constructor

public Unicycle(int startCadence, int startSpeed, int startGear, String make, double dollarDoos)
{
super(startCadence, startSpeed, make, dollarDoos);

this.numberOfWheels = 1;
}

}
