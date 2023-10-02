package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise5.*;
import aut.isp.lab4.exercise5.AquariumController;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {
    @Test
    public void LevelSensorTest(){
        FishFeeder feeder= new FishFeeder("fisfingers","super",14);
        AquariumController A = new AquariumController("asus","super bun",2.20f,feeder,2.30F,27);
        LevelSensor L = new LevelSensor("cosmin","cv",11);
        TemperatureSensor T= new TemperatureSensor("cosmin","tmp",12);

        L.setValue(10F);
        A.setLevelSensor(L);
        A.checkWaterLevel();
        A.setTemperatureSensor(T);
        assertEquals(10F,L.getValue(),0);


    }
    @Test
    public void TemperatureLevelTest(){
        FishFeeder feeder= new FishFeeder("fisfingers","super",14);
        AquariumController A = new AquariumController("asus","super bun",2.20f,feeder,2.30F,27);
        aut.isp.lab4.exercise5.Sensor T= new TemperatureSensor("cosmin","tmp",12);
        Sensor L = new LevelSensor("cosmin","cv",11);

        A.checkTemperature();
        ((aut.isp.lab4.exercise5.TemperatureSensor)T).setValue(27);
        A.setTemperatureSensor((TemperatureSensor) T);
        A.checkTemperature();
        assertEquals(27,((aut.isp.lab4.exercise5.TemperatureSensor)T).getValue());
    }

}
