package isp.lab4.exercise4;
import java.util.Random;

public class Ticket {
    private int ID;
    public Ticket(){
        Random rand = new Random();
        ID = rand.nextInt();
    }
    public int getID(){
        return ID;
    }
}
