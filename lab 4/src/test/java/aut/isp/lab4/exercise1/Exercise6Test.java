package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise6.*;
import aut.isp.lab4.exercise6.AquariumController;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise6Test {
    @Test
    public void PhTest() {
        FishFeeder feeder = new FishFeeder("fisfingers", "super", 14);
        AquariumController A = new AquariumController("asus", "super bun", 2.20f, feeder, 2.30F, 27);
        Sensor pH = new PhMonitoring("aaa", "bbb", 7);
        A.setPhMonitoring((PhMonitoring) pH);
        A.checkPh();
        ((PhMonitoring)pH).setValue(13);
        A.setPhMonitoring((PhMonitoring) pH);
        A.checkPh();
        assertEquals(13, ((PhMonitoring)pH).getValue(),0);
    }
}