import hotel.guest.Guest;
import hotel.room.Bedroom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Guest guest1;
    private Guest guest2;
    private Bedroom bedroom1;

    @Before
    public void before(){
        guest1 = new Guest("Max Ping Pong");
        guest2 = new Guest("Sofia Sing Song");
        bedroom1 = new Bedroom(RoomType.DOUBLE.getRoomValue(), RoomType.DOUBLE,204 );
    }

    @Test
    public void checkBedroomHasCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void hasEmptyGuestlist(){
        assertEquals(0, bedroom1.guestListSize());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE , bedroom1.getRoomType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(204, bedroom1.getRoomNumber());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(2, bedroom1.guestListSize());
    }

}
