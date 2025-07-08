package chapter2.v2.Practice;

public class Computer implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("컴퓨터 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터 전원이 꺼졌습니다.");
    }
}
