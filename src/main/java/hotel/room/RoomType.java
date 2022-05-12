package hotel.room;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    SUITE(4);

    private final int roomValue;

    RoomType(int roomValue) {
        this.roomValue = roomValue;
    }

    public int getRoomValue() {
        return roomValue;
    }
}
