package chapter2.v2.Practice;

public class Tv implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Tv 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv 전원이 꺼졌습니다.");
    }

    void setChangeChannel() {
        System.out.println("채널을 변경합니다.");
    }
}
