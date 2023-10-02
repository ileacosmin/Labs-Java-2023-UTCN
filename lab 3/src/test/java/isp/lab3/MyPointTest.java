package isp.lab3;
import org.junit.Test;
import isp.lab3.exercise4.MyPoint;
import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void testDistance(){
        MyPoint p1= new MyPoint(0,0,0);
        MyPoint p2= new MyPoint(0,0,1);
        assertEquals(1,p1.Distance(p2));
    }
}
