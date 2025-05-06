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

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public void checkIn(){
    //once a room has been check-in, it should be occupied and marked as dirty.
        isOccupied = true;
        isDirty = true;
        System.out.println("Guest has checked in.");
    }

    public void checkOut(){
        isOccupied = false;
        isDirty = true;
        System.out.println("Guest checked out. Room needs to be cleaned!");
        cleanRoom();
    }

    public void cleanRoom(){
        isDirty = false;
        System.out.println("Room is clean!");
    }

}
