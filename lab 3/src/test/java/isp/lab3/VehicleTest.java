package isp.lab3;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void testToString(){
        Vehicle v1= new Vehicle("Dacia","Logan",60,'D');
        assertEquals("Vehicle{model='Dacia', type='Logan', speed=60, fuelType=D}",v1.toString());
    }
}
