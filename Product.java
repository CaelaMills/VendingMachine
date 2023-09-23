public class Product {
    private final String name;
    private final double price;
    private Category category;
    private final String nutritionalFacts;

    public Product(String name, double price, String nutritionalFacts) {
        this.name = name;
        this.price = price;
        this.category = null;
        this.nutritionalFacts = nutritionalFacts;
    }
}
