public class Main {
    public static void main(String[] args) {
        //RESERVATION
        Reservation reservation = new Reservation("king", 3, true);

        //ROOM
        Room newRoom = new Room(1, false, false, reservation.getPrice() );

        //EMPLOYEE
        Employee employee1 = new Employee(1234, "Izel Ozhan", 50, "Management", 40);
        employee1.showPayroll();

        //HOTEL

        Hotel hotel = new Hotel("Izelia", 10,20);
        hotel.bookRoom(2,true);
        hotel.getAvailableRooms();


    }
}
