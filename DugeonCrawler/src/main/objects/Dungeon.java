/**
 *
 */
package main.objects;

/**
 * @author philo
 *
 */
public class Dungeon
{
    //fields
    private String name;
    private String enviromentType;
    private Integer roomNumber;
    private Integer numberOfRooms;



    //business logic
    public final String getName()
    {
        return name;
    }

    public final void setName(String name)
    {
        this.name = name;
    }

    public final String getEnviromentType()
    {
        return enviromentType;
    }

    public final void setEnviromentType(String enviromentType)
    {
        this.enviromentType = enviromentType;
    }

    public final Integer getRoomNumber()
    {
        return roomNumber;
    }

    public final void setRoomNumber(Integer roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    public final Integer getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public final void setNumberOfRooms(Integer numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
    }

    //constructors
    /**
     *
     */
    public Dungeon()
    {
        super();
    }
    //methods



}
