package aut.isp.lab4.exercise3;

public class Exercise3 {

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
