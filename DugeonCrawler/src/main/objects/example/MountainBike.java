package main.objects.example;

public class MountainBike extends Bicycle
{

    public int seatHeight;

    public int getSeatHeight()
    {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight)
    {
        this.seatHeight = seatHeight;
    }

    public MountainBike()
    {
       super();
    }

    public MountainBike(int startCadence, int startSpeed, int startGear, String make, double dollarDoos, int seatHeight)
    {
        super(startCadence, startSpeed, startGear, make, dollarDoos);
        this.seatHeight = seatHeight;

    }
    public double calculateRotationSpeedOfOneWheel()
    {
        return this.speed / this.numberOfWheels;
    }

}
