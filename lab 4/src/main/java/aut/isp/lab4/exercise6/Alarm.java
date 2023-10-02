package aut.isp.lab4.exercise6;

public class Alarm extends Actuator {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("alarm on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("alarm off");
    }
}
