package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
private static Set<Vehicle> Registry = new HashSet<>();

    public static Set<Vehicle> getRegistry() {
        return Registry;
    }

    public static void setRegistry(Set<Vehicle> registry) {
        Registry = registry;
    }

    //Add a vehicle to the registry (if it doesn't already exist)
    public void addVehicle(Vehicle V){
        boolean added = Registry.add(V);

        if(!added){
            System.out.println("not added");
        }
    }
    //Remove a vehicle from the registry using the VIN.
    public void removeVehicleByVin(int vin) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : Registry) {
            if (vehicle.getVIN()==vin) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            Registry.remove(vehicleToRemove);
            System.out.println("Vehicle with VIN " + vin + " has been removed from the registry.");
        } else {
            System.out.println("Vehicle with VIN " + vin + " not found in the registry.");
        }
    }
    //Check if a vehicle with a given VIN is in the registry.
    public Object checkForVIN(int vin){
        for (Vehicle vehicle : Registry) {
            if (vehicle.getVIN()==vin) {
                System.out.println(vehicle);
                return vehicle;
            }
        }
        return null;
    }

    public void displayVehicles(){
        for (Vehicle vehicle : Registry) {
            System.out.println(vehicle.toString());
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(2134, "ABC123", "Honda", "Accord", 2003);
        Vehicle vehicle2 = new Vehicle(4213, "XYZ789", "Chevrolet", "Camaro", 1994);
        Vehicle vehicle3 = new Vehicle(3214, "DEF456", "Fiat", "500", 2012);

        Registry.add(vehicle1);
        Registry.add(vehicle2);
        Registry.add(vehicle3);

        Vehicle vehicleDUP = new Vehicle(3214, "CF432A", "Honda", "300", 2012);

        boolean added = Registry.add(vehicleDUP);

        if(!added){
            System.out.println("nu l am ADAUGAT");
        }

        for(Vehicle v:Registry){
            System.out.println(v.toString());
        }
    }
}
