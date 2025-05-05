public class Room {
    int numberOfBeds;
    boolean isDirty;
    boolean isOccupied;
    double price;


    Room(int numberOfBeds, boolean isDirty, boolean isOccupied, double price) {
        this.numberOfBeds = numberOfBeds;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public double getPrice(String roomType, boolean isWeekend) {
        Reservation res1 = new Reservation(roomType, 2, isWeekend);
        Double newResTotal = res1.getReservationTotal();

        return getNumberOfBeds() * newResTotal;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

}
