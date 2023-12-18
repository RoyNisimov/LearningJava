package Extends;

public class Main {
    public static void main(String[] args){
        Programmer programmer = new Programmer(60, 200, "\uD83E\uDD13");
        Plumber plumber = new Plumber(7, 100, "\uD83E\uDD13");
        programmer.work();
        programmer.informBoss();
        plumber.work();
        plumber.informBoss();
    }
}
