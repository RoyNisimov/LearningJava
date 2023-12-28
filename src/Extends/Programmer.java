package Extends;

public class Programmer extends Employee{
    private int wordsPerMinute;

    public Programmer(int wordsPerMinute, double payPerHour, String workPlace){
        super(payPerHour, workPlace);
        this.wordsPerMinute = wordsPerMinute;
    }
    public void Earned(int hours){
        int wordsPerHour = this.getWordsPerMinute() * 60;
        System.out.println(wordsPerHour*hours * this.payPerHour);
    }

    public void informBoss(){
        System.out.println("Sent an email to the boss");
    }

    public int getWordsPerMinute() {
        return wordsPerMinute;
    }

    public void setWordsPerMinute(int wordsPerMinute) {
        this.wordsPerMinute = wordsPerMinute;
    }
}
