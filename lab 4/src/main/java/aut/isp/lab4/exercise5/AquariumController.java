package aut.isp.lab4.exercise5;


import aut.isp.lab4.exercise6.Actuator;
import aut.isp.lab4.exercise6.PhControl;
import aut.isp.lab4.exercise6.PhMonitoring;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder feeder;
    private float feedingTime;
    private int temperature;
    private Sensor LevelSensor=new LevelSensor("aa","bb",14);
    private Sensor TemperatureSensor=new TemperatureSensor("bb","cc",3);

    private aut.isp.lab4.exercise5.Actuator  Alarm=new Alarm();
    private aut.isp.lab4.exercise5.Actuator Heater= new Heater();


    //constructors

    public AquariumController(String manufacturer, String model, float currentTime, FishFeeder feeder, float feedingTime, int temperature) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
        this.temperature = temperature;
        this.LevelSensor= new LevelSensor("aaa","iii",12F);
        this.TemperatureSensor= new TemperatureSensor("bbb","ccc",24);

    }


    //methods


    public void setTemperatureSensor(TemperatureSensor temperatureSensor) {
        TemperatureSensor = temperatureSensor;
    }

    public void setLevelSensor(aut.isp.lab4.exercise5.Sensor levelSensor) {
        LevelSensor = levelSensor;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    public FishFeeder getFeeder() {
        return feeder;
    }

    public void setFeeder(FishFeeder feeder) {
        this.feeder = feeder;
    }

    public float getFeedingTime() {
        return feedingTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(this.currentTime==feedingTime){
            feeder.feed();
        }
    }
    public void checkWaterLevel(){

        if (((aut.isp.lab4.exercise5.LevelSensor)this.LevelSensor).getValue()< 11)
        {
            Alarm.turnOn();
        }

    }
    public void checkTemperature(){

        if(((aut.isp.lab4.exercise5.TemperatureSensor)this.TemperatureSensor).getValue()<24){
            Heater.turnOn();
        }else if(((TemperatureSensor)this.TemperatureSensor).getValue()==temperature)
            Heater.turnOff();
    }
    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feeder=" + feeder +
                ", feedingTime=" + feedingTime +
                '}';
    }



}
