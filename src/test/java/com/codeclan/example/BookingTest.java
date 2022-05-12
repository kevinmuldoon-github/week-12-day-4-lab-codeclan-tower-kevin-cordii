package com.codeclan.example;

import hotel.bookings.Booking;
import hotel.room.Bedroom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE.getRoomValue(), RoomType.DOUBLE,204 );
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void hasRoom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(2, booking.getNumberOfNights());
    }
}
