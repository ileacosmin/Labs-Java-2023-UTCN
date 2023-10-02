package aut.isp.lab4.exercise5;

public abstract class Actuator {
    private String manufacturer;
    private String model;

    public void turnOn(){
    }
    public void turnOff(){}
    @Override
    public String toString() {
        return "Actuator{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
