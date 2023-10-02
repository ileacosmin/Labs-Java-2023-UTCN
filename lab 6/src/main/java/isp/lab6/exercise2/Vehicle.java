package isp.lab6.exercise2;

import java.util.Objects;

public class Vehicle {
    private int VIN;
    private String LicensePlate;
    private String Make;
    private String model;
    private int year;

    public Vehicle(int VIN, String licensePlate, String make, String model, int year) {
        this.VIN = VIN;
        LicensePlate = licensePlate;
        Make = make;
        this.model = model;
        this.year = year;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int hashCode(){
        return Objects.hash(VIN);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Vehicle other = (Vehicle) obj;
        if (VIN == 0) {
            if ( other.VIN != 0)
                return false;
        } else if (!(VIN==other.VIN))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", LicensePlate='" + LicensePlate + '\'' +
                ", Make='" + Make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

