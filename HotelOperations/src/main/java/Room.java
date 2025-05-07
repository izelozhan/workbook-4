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

    public Room() {

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public boolean checkIn(){
    //once a room has been check-in, it should be occupied and marked as dirty.
        if (!isOccupied || !isDirty){
            System.out.println("Guest check in");
            isDirty = true;
            isOccupied = true;
            return true;
        }
        return false;
    }

    public boolean checkOut(){
        if (isOccupied){
            isOccupied = false;
            isDirty = true;
            System.out.println("Guest checked out. Room needs to be cleaned!");
            return true; //success checkout
        } else {
            System.out.println("Room is already empty");
            return false;
        }

    }

    public boolean cleanRoom(){
        if(isDirty){
            System.out.println("Room is clean!");
            isDirty = false;
            return true;
        } else {
            System.out.println("Room is already clean");
            return false;
        }
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
}
