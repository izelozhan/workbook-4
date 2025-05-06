public class Hotel {
    //check if here are rooms available for the current day only.
    String name;
    int numberOfSuits;
    int numberOfRooms;
    int bookedSuites;
    int bookedBasicRooms;

    public Hotel(String name, int numberOfSuits, int numberOfRooms) {
        this.name = name;
        this.numberOfSuits = numberOfSuits;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuits, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this(name, numberOfSuits, numberOfRooms);
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + numberOfRooms <= numberOfSuits) {
                bookedSuites = bookedSuites + numberOfRooms;
                System.out.println("You can book suit.");
                return true;
            }
        } else {
            if (bookedBasicRooms + numberOfRooms <= numberOfRooms) {
                bookedBasicRooms = bookedBasicRooms + numberOfRooms;
                System.out.println("You can book basic room.");
                return true;
            }
        }
        return false;
    }

    public int getAvailableSuites(){
        return numberOfSuits - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

}
