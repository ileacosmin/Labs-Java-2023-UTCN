package isp.lab10.raceapp;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();
        Semaphore semaphore= new Semaphore();
        frame.setLayout(new GridLayout(1,2));

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);
        RaceTimerThread timer = new RaceTimerThread();

        JFrame frame2 = new JFrame("Semaphore");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame2.getContentPane().add(semaphorePanel);
        frame2.pack();
        frame2.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        PlaySound playSound = new PlaySound();

        semaphoreThread.start();
        semaphoreThread.join();
        playSound.playSound();

        timer.startTimer();
        car1.start();
        car2.start();
        car3.start();
        car4.start();


        car1.join();
        car2.join();
        car3.join();
        car4.join();
        playSound.stopSound();


        timer.stopTimer();
        long measuredTime = timer.getTimerValue();
        System.out.println("Measured time: " + measuredTime + " milliseconds.");
    }
}
