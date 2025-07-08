package chapter2.v2.Practice;

public class Airconditioner implements ElectronicDevice{


    @Override
    public void turnOn() {
        System.out.println("에어컨 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨 전원이 꺼졌습니다.");
    }
}
