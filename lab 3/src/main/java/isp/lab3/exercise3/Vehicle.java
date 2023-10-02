package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {
    private String model,type;
    private int speed;
    private char fuelType;
    public static int noVehicle=0;
    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        noVehicle++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && fuelType == vehicle.fuelType && Objects.equals(model, vehicle.model) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, speed, fuelType);
    }

    public static void main(String[] args){
        Vehicle v1= new Vehicle("Dacia","Logan",60,'D');
        Vehicle v2= new Vehicle("Audi","A6",100,'B');
        System.out.println(Vehicle.noVehicle);
        if(v1.equals(v2)){
            System.out.println("Same");
        }else System.out.println("not same");
        System.out.println(v1.toString());
    }


}
