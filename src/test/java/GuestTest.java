import hotel.guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Max Ping Pong");
    }

    @Test
    public void hasName(){
        assertEquals("Max Ping Pong", guest.getName());
    }
}
