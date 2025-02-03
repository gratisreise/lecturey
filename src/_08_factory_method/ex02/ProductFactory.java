package _08_factory_method.ex02;

// ProductFactory class
public abstract class ProductFactory {
    // Factory Method
    public abstract Product createProduct(String type);

    public Product orderProduct(String type) {
        Product product = createProduct(type);
        product.create();
        return product;
    }
}