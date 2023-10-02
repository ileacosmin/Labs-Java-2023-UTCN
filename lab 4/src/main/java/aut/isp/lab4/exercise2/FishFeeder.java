package aut.isp.lab4.exercise2;

public class FishFeeder {

    private String manufacturer;
    private String model;
    private int meals = 14;

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

    public static void main(String[] args) {

    }
}
