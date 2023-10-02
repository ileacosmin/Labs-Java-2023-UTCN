package isp.lab6.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise2 {
    @Test
    public void TestVehicleAdd()
    {
        Vehicle vehicle1 = new Vehicle(2134, "ABC123", "Honda", "Accord", 2003);
        Vehicle vehicle2 = new Vehicle(4213, "XYZ789", "Chevrolet", "Camaro", 1994);
        Vehicle vehicle3 = new Vehicle(3214, "DEF456", "Fiat", "500", 2012);
        Exercise2 e2 = new Exercise2();
        e2.addVehicle(vehicle1);
        e2.addVehicle(vehicle2);
        e2.addVehicle(vehicle3);

        assertEquals(3,e2.getRegistry().size());
    }

    @Test
    public void TestVehicleRemoveByVin(){
        Vehicle vehicle1 = new Vehicle(2134, "ABC123", "Honda", "Accord", 2003);
        Vehicle vehicle2 = new Vehicle(4213, "XYZ789", "Chevrolet", "Camaro", 1994);
        Vehicle vehicle3 = new Vehicle(3214, "DEF456", "Fiat", "500", 2012);
        Exercise2 e3 = new Exercise2();
        e3.addVehicle(vehicle1);
        e3.addVehicle(vehicle2);
        e3.addVehicle(vehicle3);

        e3.removeVehicleByVin(2134);
        assertEquals(2,e3.getRegistry().size());
    }

    @Test
    public void TestCheckForVin(){
        Vehicle vehicle1 = new Vehicle(2134, "ABC123", "Honda", "Accord", 2003);
        Vehicle vehicle2 = new Vehicle(4213, "XYZ789", "Chevrolet", "Camaro", 1994);
        Vehicle vehicle3 = new Vehicle(3214, "DEF456", "Fiat", "500", 2012);
        Exercise2 e2 = new Exercise2();
        e2.addVehicle(vehicle1);
        e2.addVehicle(vehicle2);
        e2.addVehicle(vehicle3);

        assertEquals(vehicle3,e2.checkForVIN(3214));
    }
}
