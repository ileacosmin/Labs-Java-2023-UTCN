package isp.lab6.exercise3;

import java.util.Objects;

public class Product implements Comparable<Product> {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public boolean equals(Product o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    public int hashCode(){
        return 31 +(name == null ? 0 : name.hashCode());
    }
    @Override
    public int compareTo(Product o1) {
        int result = name.compareTo(o1.getName());
        if (result != 0) {
            return result;
        } else {
            return Double.compare(o1.getPrice(), price);
        }
    }

}
