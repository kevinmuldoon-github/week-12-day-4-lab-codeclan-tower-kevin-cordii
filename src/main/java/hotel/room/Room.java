package hotel.room;

import hotel.guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    int capacity;
    ArrayList <Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public int guestListSize(){
        return guestList.size();
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    public void addGuest(Guest guest){
        if (guestListSize() < capacity){
            this.guestList.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        if (guestList.contains(guest)){
            this.guestList.remove(guest);
        }
    }

}
