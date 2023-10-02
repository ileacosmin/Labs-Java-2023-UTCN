package aut.isp.lab4.exercise1;
import aut.isp.lab4.exercise3.FishFeeder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishFeederTest{
    @Test
    public void fillUpTest() {
        FishFeeder f= new FishFeeder("audi","smecher",12);
        f.fillUp();
        assertEquals(14,f.getMeals());
    }
    @Test
    public void feedTest(){
        FishFeeder f= new FishFeeder("audi","smecher",12);
        f.feed();
        assertEquals(11,f.getMeals());
    }

}