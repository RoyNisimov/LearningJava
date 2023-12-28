package Extends;

public class Plumber extends Employee{
    private int truckMeterLength;
    public Plumber(int truckMeterLength, double payPerHour, String workPlace){
        super(payPerHour, workPlace);
        this.truckMeterLength = truckMeterLength;
    }

    public void fillTrucks(int hours){
        for (int i = 0; i <= hours; i++){
            this.work();
        }
    }
    // ????

    public int getTruckMeterLength() {
        return truckMeterLength;
    }

    public void setTruckMeterLength(int truckMeterLength) {
        this.truckMeterLength = truckMeterLength;
    }
}
