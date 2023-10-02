package isp.lab4.exercise3;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Sensor> sensors= new ArrayList<Sensor>();
        for(int i=0;i<5;i++) {
            sensors.add(new TemperatureSensor(i+4));
        }
        for(int i=5;i<10;i++) {
            sensors.add(new PressureSensor(i));
        }
        MonitoringService M =new MonitoringService(sensors);
        System.out.println(M.getAverageTemperatureSensors());
        System.out.println(M.getAverageAllSensors());
    }
}
