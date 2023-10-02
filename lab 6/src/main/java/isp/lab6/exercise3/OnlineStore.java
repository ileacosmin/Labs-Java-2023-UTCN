package isp.lab6.exercise3;

import java.util.*;

public class OnlineStore {
    private List<Product> products = new ArrayList<Product>();
    private Map<String, ActiveSession > sessions = new HashMap<String, ActiveSession>();

    public void addSesion(String username){
        sessions.put(username,new ActiveSession(username));
    }
    public Map<String, ActiveSession> getSessions() {
        return sessions;
    }

    public OnlineStore(){
        products.add(new Product("Shirt", 25));
        products.add(new Product("Pants", 35));
        products.add(new Product("Socks", 5));
        products.add(new Product("Hat", 15));
        products.add(new Product("Jacket", 75));
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void showProducts(){
        for(Product product: products){
            System.out.println(product);
        }
    }
    public void setSessions(Map<String, ActiveSession> sessions) {
        this.sessions = sessions;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductsSorted(){
        Collections.sort(products);
        return products;
    }

    void addSession(String username){
        ActiveSession activeSession = new ActiveSession(username);
        sessions.put(username,activeSession);
    }
    void removeSession(String username){
        sessions.remove(username);
    }

    public void addToCart(String username, Product product,int quantity){
        sessions.get(username).addToCart(product,quantity);
    }
    public Product getProductByName(String name){
        for(Product product : products){
            if (product.getName().equals(name))
                return product;
        }
        System.out.println("product not found");
        return null;

    }
    public void checkOut(String username){
        System.out.println("Customer "+ username + " checked out");
        System.out.println("Total price :"+sessions.get(username).getPriceOfShopingCart());
    }

}
