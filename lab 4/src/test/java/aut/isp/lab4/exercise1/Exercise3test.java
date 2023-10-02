package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise3.AquariumController;
import aut.isp.lab4.exercise3.FishFeeder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3test {
    @Test
    public void testSetCurrentTime(){
        FishFeeder feeder= new FishFeeder("fisfingers","super",14);
        aut.isp.lab4.exercise3.AquariumController A = new AquariumController("asus","super bun",2.20f,feeder,2.30F);

        A.setCurrentTime(2.30F);
        FishFeeder f;
        f=A.getFeeder();
        assertEquals(13,f.getMeals());



    }
}
