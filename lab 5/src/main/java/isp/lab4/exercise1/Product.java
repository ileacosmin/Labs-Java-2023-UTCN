package isp.lab4.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory ProductCategory;
    private Customer Custumer;

    public Product(String productId, String name, double price, isp.lab4.exercise1.ProductCategory productCategory, Customer custumer) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        ProductCategory = productCategory;
        Custumer = custumer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public isp.lab4.exercise1.ProductCategory getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(isp.lab4.exercise1.ProductCategory productCategory) {
        ProductCategory = productCategory;
    }

    public Customer getCustumer() {
        return Custumer;
    }

    public void setCustumer(Customer custumer) {
        Custumer = custumer;
    }
}
