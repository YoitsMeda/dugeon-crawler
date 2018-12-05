package main.objects.example;

public class Cycle
{
    protected int cadence;
    protected int speed;
    protected String make;
    protected double dollarDoos;
    protected int numberOfWheels;


    //constructors

    //fields
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }



    public double getDollarDoos()
    {
        return dollarDoos;
    }

    public void setDollarDoos(double dollarDoos)
    {
        this.dollarDoos = dollarDoos;
    }

    public  String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    // the Bicycle class has
    // one constructor

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue)
    {
        cadence = newValue;
    }


    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }
public Cycle()
{
    super();
}

public Cycle(int startCadence, int startSpeed, String make, double dollarDoos)
{

this.cadence = startCadence;
this.speed = startSpeed;
this.make = make;
this.dollarDoos = dollarDoos;
}

}