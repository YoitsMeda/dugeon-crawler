package main.objects.example;

public class Tricycle extends Cycle
{
    //fields
    private int gear;




    public int getGear() {
        return gear;
    }
    public void setGear(int newValue) {
        this.gear = newValue;
    }
    public Tricycle(int startCadence, int startSpeed, int startGear, String make, double dollarDoos)
    {
        super(startCadence, startSpeed, make, dollarDoos);
        this.gear = startGear;
        this.numberOfWheels = 3;
    }
    public Tricycle()
    {
        // TODO Auto-generated constructor stub
    }

}
