package isp.lab10.raceapp;

import java.util.concurrent.atomic.AtomicBoolean;

public class RaceTimerThread extends Thread {
    private long timer;
    private AtomicBoolean running;

    public RaceTimerThread() {
        timer = 0;
        running = new AtomicBoolean(false);
    }

    public void startTimer() {
        running.set(true);
        start();
    }

    public void stopTimer() {
        running.set(false);
    }

    public long getTimerValue() {
        return timer;
    }

    @Override
    public void run() {
        while (running.get()) {
            try {
                Thread.sleep(10);
                timer += 10;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Race completed! The measured time is: " + timer + " milliseconds.");
    }
}
