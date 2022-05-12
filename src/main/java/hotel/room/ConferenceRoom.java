package hotel.room;

public class ConferenceRoom extends Room{

    private String name;
    private int hourlyRate;

    public ConferenceRoom(int capacity, String name, int hourlyRate) {
        super(capacity);
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
