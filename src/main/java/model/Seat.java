package model;

public abstract class Seat {

    private int number;

    private boolean isFree;

    private int cost;

    public Seat(int number, boolean isFree, int cost) {
        this.number = number;
        this.isFree = isFree;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getCost() {
        return cost;
    }
}
