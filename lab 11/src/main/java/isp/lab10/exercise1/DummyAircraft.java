package isp.lab10.exercise1;

public class DummyAircraft implements Runnable{

    String id;
    String lock = "lock";
    int k = 0;

    public DummyAircraft(String id) {
        this.id = id;
        System.out.println("Aircraft "+id+" is created. Ready to take off.");
    }

    public void start(){
        Thread t = new Thread(this);
        t.start();
    }

    public void run(){

        while(k<20){
            System.out.println("Aircraft "+id+" is flying");
            k++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(k==15){
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }//.while
        System.out.println("Aircraft "+id+" is landing.");
    }

    public void land(){
        synchronized (lock){
            lock.notify();
        }
    }

    public static void main(String[] args) {
        DummyAircraft da = new DummyAircraft("1");
        //da.start();
        Thread t  = new Thread(da);
        t.start();
    }
}
