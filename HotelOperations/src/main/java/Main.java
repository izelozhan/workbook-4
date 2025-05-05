public class Main {
    public static void main(String[] args) {
        Room newRoom;
        Employee employee;
        Reservation reservation;

        reservation = new Reservation("king", 3, true);
        newRoom = new Room(1, false, false, reservation.getPrice() );

    }
}
