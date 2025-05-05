public class Reservation {
    String roomType;
    int numberOfNights;
    boolean isWeekend;
    double total;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend, double total) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.total = total;
    }



}
