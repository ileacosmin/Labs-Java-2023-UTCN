package aut.isp.lab4.exercise4;


public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeeder feeder;
    private float feedingTime;
    private float lightsOnTime;
    private float LightsOffTime;

    //constructors

    public AquariumController(String manufacturer, String model, float currentTime, FishFeeder feeder, float feedingTime, int lightsOnTime, int lightsOffTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
        this.lightsOnTime = lightsOnTime;
        this.LightsOffTime = lightsOffTime;
    }


    //methods

    public void setLightsOnTime(float lightsOnTime) {
        this.lightsOnTime = lightsOnTime;
    }

    public void setLightsOffTime(float lightsOffTime) {
        LightsOffTime = lightsOffTime;
    }

    public float getLightsOnTime() {
        return lightsOnTime;
    }

    public void setLightsOnTime(int lightsOnTime) {
        this.lightsOnTime = lightsOnTime;
    }

    public float getLightsOffTime() {
        return LightsOffTime;
    }

    public void setLightsOffTime(int lightsOffTime) {
        LightsOffTime = lightsOffTime;
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
        this.lightsOnTime = currentTime;
        this.LightsOffTime = currentTime+6;
        if(this.currentTime==feedingTime){
            feeder.feed();
        }
    }
    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feeder=" + feeder +
                ", feedingTime=" + feedingTime +
                ", lightsOnTime=" + lightsOnTime +
                ", LightsOffTime=" + LightsOffTime +
                '}';
    }
}
