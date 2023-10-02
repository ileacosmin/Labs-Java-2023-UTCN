package aut.isp.lab4.exercise6;

public class PhMonitoring extends Sensor{
    private float value;

    public PhMonitoring() {
    }

    public PhMonitoring(String manufacturer, String model, float value) {
        super(manufacturer, model);
        this.value = value;
    }
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
