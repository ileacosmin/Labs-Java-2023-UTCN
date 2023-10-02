package isp.lab4.exercise3;

public class PressureSensor extends Sensor{
    private double pressure;

    public PressureSensor(double pressure) {
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
