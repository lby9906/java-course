package chapter2.v2.Practice;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Airconditioner airconditioner = new Airconditioner();
        Computer computer = new Computer();

        tv.turnOn();
        airconditioner.turnOn();
        computer.turnOn();

        tv.turnOff();
        airconditioner.turnOff();
        computer.turnOff();

        tv.setChangeChannel();
    }
}
