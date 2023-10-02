import isp.lab4.exercise1.Customer;
import isp.lab4.exercise1.Product;
import isp.lab4.exercise1.ProductCategory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class exercise1Test {
    @Test
    public void ProductTest(){
        Customer c= new Customer();
        Product P= new Product("#2444","bear",12, ProductCategory.TOYS,c);

        assertEquals(ProductCategory.TOYS,P.getProductCategory());
    }
}
