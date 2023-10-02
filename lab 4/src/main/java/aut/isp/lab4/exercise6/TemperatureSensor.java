package aut.isp.lab4.exercise6;

public class TemperatureSensor extends Sensor {
    private int value;

    public TemperatureSensor(String manufacturer, String model, int value){
        super(manufacturer,model);
        this.value=value;

    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                '}';
    }
}
