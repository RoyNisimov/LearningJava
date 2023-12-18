package Extends;

public class Plumber extends Employee{
    private int truckMeterLength;
    public Plumber(int truckMeterLength, double payPerHour, String workPlace){
        super(payPerHour, workPlace);
        this.truckMeterLength = truckMeterLength;
    }

    public int getTruckMeterLength() {
        return truckMeterLength;
    }

    public void setTruckMeterLength(int truckMeterLength) {
        this.truckMeterLength = truckMeterLength;
    }
}
