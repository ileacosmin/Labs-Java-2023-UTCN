package isp.lab10.exercise1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aircraft implements Runnable {
    private String id;
    private int altitude;
    int k = 0;
    String lock = "lock";

    public Aircraft(String id) {
        this.id = id;
        System.out.println("Aircraft " + id + " is created. Ready to take off.");
    }

    public void receiveAtcCommand(AtcCommand msg) {

    }

    @Override
    public void run() {
        while (k < 100) {
            if (k < 10)
                System.out.println("Aircraft " + id + " is preparing to fly");
            k++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (k >= 10 && k < 15) {
                System.out.println("Aircraft " + id + " is taking off");
            }
            if (k == 15) {
                System.out.println("Aircraft " + id + " is ascending " + LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()) );
                try {
                    Thread.sleep(10000L * this.getAltitude());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Aircraft " + id + " has reached his altitude " + LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()));
            }
            if (k > 15) {
                System.out.println("Aircraft " + id + " is flying, sleep well");

                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Aircraft " + id + " is descending "+  LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()));
                    try {
                        Thread.sleep(10000L * this.getAltitude());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Aircraft " + id + " is on the ground "+ LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()) );
                }
            }
        }

    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public void land() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
