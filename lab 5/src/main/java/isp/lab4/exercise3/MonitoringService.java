package isp.lab4.exercise3;

import java.util.ArrayList;

public class MonitoringService {
    private ArrayList<Sensor> sensors;
    public MonitoringService(ArrayList<Sensor> sensors) {
        this.sensors = sensors;
    }
    public double getAverageTemperatureSensors(){
        double sum=0;
        double cnt=0;
        for(int i=0;i<10;i++)
       if(sensors.get(i).getClass()==TemperatureSensor.class){
           sum+=((TemperatureSensor)sensors.get(i)).getTemperature();
           cnt++;
       }
        return sum/cnt;
    }
    public double getAverageAllSensors(){
        double sum=0;
        double cnt=0;
        for(int i=0;i<10;i++){
            if(sensors.get(i).getClass()==TemperatureSensor.class){
                sum+=((TemperatureSensor)sensors.get(i)).getTemperature();
                cnt++;
            }
            if(sensors.get(i).getClass()==PressureSensor.class){
                sum+=((PressureSensor)sensors.get(i)).getPressure();
                cnt++;
            }
        }
        return sum/cnt;
    }
}
