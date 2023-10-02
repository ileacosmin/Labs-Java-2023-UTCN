package isp.lab4.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private Double totalPrice;
    private ArrayList<Product> products=new ArrayList<Product>(10);

    public void addProduct(Product p){
        products.add(p);
    }
}
