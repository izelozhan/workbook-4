public class Reservation {
    String roomType;
    boolean isWeekend;
    int numberOfNights;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double price = 0;

        if (this.roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }


        if (isWeekend) {
            price *= 1.10;
        }
        return price;
    }


    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
