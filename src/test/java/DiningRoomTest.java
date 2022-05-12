import hotel.guest.Guest;
import hotel.room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        diningRoom = new DiningRoom(20, "Eatery");
        guest1 = new Guest("Max Ping Pong");
        guest2 = new Guest("Sofia Sing Song");
    }

    @Test
    public void hasAllRoomAttributes(){
        assertEquals(20, diningRoom.getCapacity());
        assertEquals("Eatery", diningRoom.getName());
        assertEquals(0, diningRoom.guestListSize());
    }

    @Test
    public void canAddGuestsToDiningRoom(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        assertEquals(2, diningRoom.guestListSize());
    }
}
