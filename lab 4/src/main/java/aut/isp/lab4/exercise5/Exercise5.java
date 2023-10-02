package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
       FishFeeder feeder= new FishFeeder("fisfingers","super",14);
       AquariumController A = new AquariumController("asus","super bun",2.20f,feeder,2.30F,27);
       Sensor T= new TemperatureSensor("cosmin","tmp",12);
       Sensor L = new LevelSensor("cosmin","cv",11);

       ((LevelSensor) L).setValue(10F);

       A.setLevelSensor((LevelSensor) L);
       A.checkWaterLevel();
       A.setTemperatureSensor((TemperatureSensor) T);

       A.checkTemperature();
       ((TemperatureSensor) T).setValue(27);
       A.setTemperatureSensor((TemperatureSensor) T);
       A.checkTemperature();



    }
}
