package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ActiveSession {
    private String username = new String();
    private Map<Product, Integer > ShoppingCart = new HashMap<Product, Integer>();
    public ActiveSession(String username) {
        this.username = username;
    }
    public int getPriceOfShopingCart(){
        AtomicInteger sum= new AtomicInteger();
        ShoppingCart.forEach((k,v)-> sum.addAndGet(k.getPrice() * v));
        return sum.get();
    }
    public void addToCart (Product product, Integer quantity){
        ShoppingCart.put(product,quantity);
    }

    public String getUsername() {
        return username;
    }

    public Map<Product, Integer> getShoppingCart() {
        return ShoppingCart;
    }

    @Override
    public String toString() {
        return "ActiveSession{" +
                "username='" + username + '\'' +
                ", ShoppingCart=" + ShoppingCart +
                '}';
    }
}
