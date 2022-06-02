package model;

public class VipSeat extends Seat {

    public VipSeat(int number, int cost) {
        super(number, true, cost * 2);
    }
}
