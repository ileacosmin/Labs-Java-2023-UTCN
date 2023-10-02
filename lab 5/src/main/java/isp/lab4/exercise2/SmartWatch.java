package isp.lab4.exercise2;

public class SmartWatch implements Chargeable{
    private int batteryLevel;

    @Override
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public void charge(int duration){
        //smartWatch charges to 20% in 10 minutes
        batteryLevel+=(20*duration)/10;
        if(batteryLevel>100)
            batteryLevel=100;
    }
}
