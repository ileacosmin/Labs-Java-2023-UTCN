import isp.lab4.exercise2.Chargeable;
import isp.lab4.exercise2.Laptop;
import isp.lab4.exercise2.SmartPhone;
import isp.lab4.exercise2.SmartWatch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class exercise2Test {
    @Test
    public void LaptopCharge(){
        Chargeable laptop = new Laptop();
        ((Laptop) laptop).setBatteryLevel(14);
        laptop.charge(30);
        assertEquals(54,laptop.getBatteryLevel());
    }
    @Test
    public void SmartPhoneCharge(){
        Chargeable smartPhone = new SmartPhone();
        smartPhone.charge(30);
        assertEquals(46,smartPhone.getBatteryLevel());
    }
    @Test
    public void SmartWatchCharge(){
        Chargeable smartWatch = new SmartWatch();
        smartWatch.charge(30);
        assertEquals(60,smartWatch.getBatteryLevel());
    }
}
