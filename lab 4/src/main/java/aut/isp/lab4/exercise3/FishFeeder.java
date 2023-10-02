package aut.isp.lab4.exercise3;

public class FishFeeder {

    private String manufacturer;
    private String model;
    private int meals = 14;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }



    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMeals() {
        return meals;
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
    public void fillUp(){
        this.meals=14;
        System.out.println("meals filled up");
    }
    public void feed(){
        this.meals-=1;
        System.out.println("fish feed and the no of meals deacrased by one");
    }

}
