package aut.isp.lab4.exercise4;

import aut.isp.lab4.exercise3.AquariumController;
import aut.isp.lab4.exercise3.FishFeeder;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder feeder= new FishFeeder("fisfingers","super",14);
        AquariumController A = new AquariumController("asus","super bun",2.20f,feeder,2.30F);
        A.setCurrentTime(2.30F);
        A.setCurrentTime(2.30F);
        A.setCurrentTime(2.30F);

        FishFeeder f;
        f=A.getFeeder();

        System.out.println( A.toString());
    }
}
