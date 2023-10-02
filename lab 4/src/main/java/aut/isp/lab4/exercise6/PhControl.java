package aut.isp.lab4.exercise6;

public class PhControl extends Actuator{


    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("pH changes on");
    }
    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("pH changes off");
    }
}
