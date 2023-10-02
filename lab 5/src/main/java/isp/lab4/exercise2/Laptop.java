package isp.lab4.exercise2;

public class Laptop implements Chargeable{
    private int batteryLevel;

    @Override
    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void charge(int duration){
        //laptop charges to 20% in 15 minutes
        batteryLevel+=(20*duration)/15;
        if(batteryLevel>100)
            batteryLevel=100;
    }


}
