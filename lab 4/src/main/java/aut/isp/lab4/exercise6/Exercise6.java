package aut.isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        FishFeeder feeder = new FishFeeder("fisfingers", "super", 14);
        AquariumController A = new AquariumController("asus", "super bun", 2.20f, feeder, 2.30F, 27);
        Sensor pH = new PhMonitoring("aaa", "bbb", 7);
        A.setPhMonitoring((PhMonitoring) pH);
        A.checkPh();
        ((PhMonitoring)pH).setValue(13);
        A.setPhMonitoring((PhMonitoring) pH);
        A.checkPh();
    }
}