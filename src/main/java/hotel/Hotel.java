package hotel;

import hotel.bookings.Booking;
import hotel.guest.Guest;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.DiningRoom;
import hotel.room.Room;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> hotelRooms;
    private ConferenceRoom[] hotelConferenceRooms;
    private HashMap<String, DiningRoom> hotelDiningRooms;
    private ArrayList<Booking> bookingsList;

    public Hotel() {
        this.hotelRooms = new ArrayList<>();
        this.hotelConferenceRooms = new ConferenceRoom[2];
        this.hotelDiningRooms = new HashMap<>();
        this.bookingsList = new ArrayList<>();
    }

    public ArrayList<Bedroom> getHotelRooms() {
        return hotelRooms;
    }

    public ConferenceRoom[] getHotelConferenceRooms() {
        return hotelConferenceRooms;
    }

    public HashMap<String, DiningRoom> getHotelDiningRooms() {
        return hotelDiningRooms;
    }

    public int numberOfHotelRooms(){
        return hotelRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        hotelRooms.add(bedroom);
    }

    public int numberOfConferenceRooms(){
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

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking newBooking = new Booking(bedroom, numberOfNights);
        this.bookingsList.add(newBooking);
        return newBooking;
    }

    public void addDiningRoomToHotel(DiningRoom diningRoom) {
        String diningRoomName = diningRoom.getName();

        if (!this.hotelDiningRooms.containsKey(diningRoomName)){
            this.hotelDiningRooms.put(diningRoomName, diningRoom);
        }
    }

    public ArrayList<Bedroom> vacancies(){
        ArrayList<Bedroom> vacanciesList = new ArrayList<>();
        for(int i = 0; i < numberOfHotelRooms(); i++){
            if( !bookingsList.contains(hotelRooms.get(i)) ){
                vacanciesList.add(hotelRooms.get(i));
            }
        }
        return vacanciesList;
    }
}
