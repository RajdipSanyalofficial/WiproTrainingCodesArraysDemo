package arraysdemo;

//Instance class of products
public class Product {

    private String name;
    private double price;

    //generate constructors


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //generate getters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //generate toString() method - convert object to string and display values

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
