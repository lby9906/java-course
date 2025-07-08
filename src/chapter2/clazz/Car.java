package chapter2.clazz;

public class Car {
    String name;
    String carModel;

    Car(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    public void drive() {
        System.out.println(name + "[" + this.carModel + "] 을 주행");
    }

    public void accelerate() {
        System.out.println(name + "[" + this.carModel + "] 이 가속");
    }
}
