package main.objects;

import java.util.HashMap;
import java.util.Map;

public enum RoomType
{
    MONSTER_ROOM(""),
    TRAP_ROOM("Trap Room"),
    CHEST_ROOM("Chest Room");



    private String commonName;

    private RoomType(String commonName)
    {
        this.commonName = commonName;
    }

    private static final Map<String, RoomType> ROOM_TYPE_DICTIONARY = new HashMap<String, RoomType>();
    static
    {
        for (RoomType authority : RoomType.values())
        {
            ROOM_TYPE_DICTIONARY.put(authority.commonName, authority);
        }
    }

    public String getRoomType()
    {
        return this.toString();
    }

    public static RoomType getAuthority(String commonName)
    {
       return ROOM_TYPE_DICTIONARY.get(commonName);
    }
}
