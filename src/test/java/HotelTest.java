import hotel.Hotel;
import hotel.bookings.Booking;
import hotel.guest.Guest;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel codeClanTower;

    private Guest guest1;
    private Guest guest2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom lovelace;
    private ConferenceRoom mikeritchie;


    @Before
    public void before(){
        codeClanTower = new Hotel();
        guest1 = new Guest("Max Ping Pong");
        guest2 = new Guest("Sofia Sing Song");
        bedroom1 = new Bedroom(RoomType.DOUBLE.getRoomValue(), RoomType.DOUBLE,204 , 200);
        bedroom2 = new Bedroom(RoomType.SINGLE.getRoomValue(), RoomType.DOUBLE,204 , 200);
        bedroom3 = new Bedroom(RoomType.SUITE.getRoomValue(), RoomType.DOUBLE,204, 200 );
        lovelace = new ConferenceRoom(20, "Lovelace", 300);
        mikeritchie = new ConferenceRoom(15, "Mike Ritchie", 200);
    }

    @Test
    public void canAddBedroom(){
        codeClanTower.addBedroom(bedroom1);
        codeClanTower.addBedroom(bedroom2);
        codeClanTower.addBedroom(bedroom3);
        assertEquals(3, codeClanTower.numberOfHotelRooms());
        }

    @Test
    public void canAddConferenceRoom(){
        codeClanTower.addConferenceRoom(lovelace, mikeritchie);
        assertEquals(2, codeClanTower.numberOfConferenceRooms());
        }

    @Test
    public void canCheckInGuest(){
        codeClanTower.addGuestToRoom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestListSize());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        codeClanTower.addGuestToRoom(guest1, lovelace);
        assertEquals(1, lovelace.guestListSize());
    }

    @Test
    public void canCheckOutGuest(){
        codeClanTower.addGuestToRoom(guest1, bedroom1);
        codeClanTower.removeGuestFromRoom(guest1, bedroom1);
        assertEquals(0, bedroom1.guestListSize());
    }

    @Test
    public void canCheckOutGuestToConferenceRoom(){
        codeClanTower.addGuestToRoom(guest1, lovelace);
        codeClanTower.removeGuestFromRoom(guest1, lovelace);
        assertEquals(0, lovelace.guestListSize());
    }

    @Test
    public void canBookRoom(){
        Booking newBooking = codeClanTower.bookRoom(bedroom1, 2);
        assertEquals(bedroom1, newBooking.getBedroom());
        assertEquals(2, newBooking.getNumberOfNights());
    }

    }
