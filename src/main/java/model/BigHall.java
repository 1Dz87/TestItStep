package model;

public class BigHall extends Hall {

    public BigHall(int cost) {
        super(100, 25, cost);
    }

    public void getSeat(int seatNumber) {
        if (super.getSeats()[seatNumber].isFree()) {
            super.getSeats()[seatNumber].setFree(false);
        }
    }

    public void seatFree(int seatNumber) {
        super.getSeats()[seatNumber].setFree(true);
    }
}
