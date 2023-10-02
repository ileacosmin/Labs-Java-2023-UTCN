package aut.isp.lab4.exercise1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AquariumControllerTest {
    @Test
    public void testToString() {
        AquariumController A = new AquariumController("cosmin", "fain", 2.5F);
        assertEquals("AquariumController{manufacturer='cosmin', model='fain', currentTime=2.5}", A.toString());
    }

}
