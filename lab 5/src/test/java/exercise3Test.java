import isp.lab4.exercise3.MonitoringService;
import isp.lab4.exercise3.PressureSensor;
import isp.lab4.exercise3.Sensor;
import isp.lab4.exercise3.TemperatureSensor;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class exercise3Test {
    @Test
    public void GetAverageTempSensTest() {
        ArrayList<Sensor> sensors = new ArrayList<Sensor>();
        for (int i = 0; i < 5; i++) {
            sensors.add(new TemperatureSensor(i + 4));
        }
        for (int i = 5; i < 10; i++) {
            sensors.add(new PressureSensor(i));
        }
        MonitoringService M = new MonitoringService(sensors);
        assertEquals(6.0,M.getAverageTemperatureSensors(),0);

    }
    @Test
    public void GetAverageAllSensTest(){
        ArrayList<Sensor> sensors = new ArrayList<Sensor>();
        for (int i = 0; i < 5; i++) {
            sensors.add(new TemperatureSensor(i + 4));
        }
        for (int i = 5; i < 10; i++) {
            sensors.add(new PressureSensor(i));
        }
        MonitoringService M = new MonitoringService(sensors);
        assertEquals(6.5,M.getAverageAllSensors(),0);
    }
}
