import hotel.room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom lovelace;

    @Before
    public void before(){
        lovelace = new ConferenceRoom(20, "Lovelace", 300);
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Lovelace" , lovelace.getName());
    }

    @Test
    public void hasHourlyRate(){
        assertEquals(300, lovelace.getHourlyRate());
    }
}
