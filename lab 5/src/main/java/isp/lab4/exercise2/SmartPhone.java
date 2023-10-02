package isp.lab4.exercise2;

public class SmartPhone implements Chargeable {
    private int batteryLevel;

    @Override
    public int getBatteryLevel(){
        return batteryLevel;
    }
    public void charge(int duration){
        //smartphone charges to 20% in 13 minutes
        batteryLevel+=(20*duration)/13;
        if(batteryLevel>100)
            batteryLevel=100;
    }
}
