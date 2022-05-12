package hotel;

import hotel.guest.Guest;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.Room;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> hotelRooms;
    private ConferenceRoom[] hotelConferenceRooms;

    public Hotel() {
        this.hotelRooms = new ArrayList<>();
        this.hotelConferenceRooms = new ConferenceRoom[2];
    }

    public ArrayList<Bedroom> getHotelRooms() {
        return hotelRooms;
    }

    public ConferenceRoom[] getHotelConferenceRooms() {
        return hotelConferenceRooms;
    }

    public int numerOfHotelRooms(){
        return hotelRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        hotelRooms.add(bedroom);
    }


    public int numerOfConferenceRooms(){
        return hotelConferenceRooms.length;
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom1, ConferenceRoom conferenceRoom2){
        hotelConferenceRooms[0] = conferenceRoom1;
        hotelConferenceRooms[1] = conferenceRoom2;
    }

    public void addGuestToRoom(Guest guest, Room room){
        room.addGuest(guest);
    }

    public void removeGuestFromRoom(Guest guest, Room room) {
        room.removeGuest(guest);
    }


}
