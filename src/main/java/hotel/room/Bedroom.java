package hotel.room;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(int capacity, RoomType roomType, int roomNumber) {
        super(capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
