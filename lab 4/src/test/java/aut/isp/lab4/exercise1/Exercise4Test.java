package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise4.AquariumController;
import aut.isp.lab4.exercise4.FishFeeder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    @Test
    public void setCurrentTimeTest(){
        FishFeeder feeder= new FishFeeder("fisfingers","super",14);
        AquariumController A = new AquariumController("asus","super bun",2.20f,feeder,2.30F,0,0);
        A.setCurrentTime(2.30F);
        assertEquals(8.3F,A.getLightsOffTime(),0);
    }
}
