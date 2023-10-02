package aut.isp.lab4.exercise5;

public class Heater extends Actuator{
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("heater on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("heater off");
    }
}
