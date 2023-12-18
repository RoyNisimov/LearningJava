package Extends;

public class Programmer extends Employee{
    private int wordsPerMinute;

    public Programmer(int wordsPerMinute, double payPerHour, String workPlace){
        super(payPerHour, workPlace);
        this.wordsPerMinute = wordsPerMinute;
    }

    public int getWordsPerMinute() {
        return wordsPerMinute;
    }

    public void setWordsPerMinute(int wordsPerMinute) {
        this.wordsPerMinute = wordsPerMinute;
    }
}
