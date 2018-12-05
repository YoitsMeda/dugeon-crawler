package main.objects.example;


public class Bicycle extends Cycle
        {
        private int gear;


         public int getGear()
        {
            return gear;
        }


        public void setGear(int newValue)
        {
            this.gear = newValue;
        }


        public Bicycle()
         {
         super();
         }
            // fields


    public Bicycle(int startCadence, int startSpeed, int startGear, String make, double dollarDoos)
    {
        super(startCadence, startSpeed, make, dollarDoos);
        this.gear = startGear;
        this.numberOfWheels = 2;

    }
}//END CLASS
