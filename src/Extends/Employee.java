package Extends;

public class Employee {
    protected double payPerHour;
    protected String workPlace;

    public Employee(double payPerHour, String workPlace){
        this.payPerHour = payPerHour;
        this.workPlace = workPlace;
    }

    public void work(){
        System.out.println("Working 2 hours, pay is " + this.payPerHour*2);
    }
    public void informBoss(){
        System.out.println("Went to see el jefe");
    }
}
