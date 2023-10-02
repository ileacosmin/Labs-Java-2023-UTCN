package isp.lab4.exercise3;

public class TemperatureSensor extends Sensor {
    private double temperature;
    public TemperatureSensor(){

    }
    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
