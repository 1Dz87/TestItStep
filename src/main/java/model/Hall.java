package model;

public abstract class Hall {

    private int seatsNumber;

    private int vipNumber;

    private Seat[] seats;

    public Hall(int seatsNumber, int vipNumber, int cost) {
        this.seatsNumber = seatsNumber;
        this.vipNumber = vipNumber;
        this.seats = new Seat[this.seatsNumber];
        for (int i = 0; i < vipNumber; i++) {
            this.seats[i] = new VipSeat(i + 1, cost);
        }
        for (int i = vipNumber; i < seatsNumber; i++) {
            this.seats[i] = new CommonSeat(i + 1, cost);
        }
    }

    public abstract void getSeat(int seatNumber);

    public abstract void seatFree(int seatNumber);

    public Seat[] getSeats() {
        return seats;
    }
}
