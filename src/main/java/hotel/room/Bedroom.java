package hotel.room;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;
    private double roomRate;

    public Bedroom(int capacity, RoomType roomType, int roomNumber, double roomRate) {
        super(capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.roomRate = roomRate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRoomRate() {
        return roomRate;
    }
}
