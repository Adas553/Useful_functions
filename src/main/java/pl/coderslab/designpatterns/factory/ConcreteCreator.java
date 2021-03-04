package pl.coderslab.designpatterns.factory;

public class ConcreteCreator implements Creator{

    @Override
    public Product createProduct(String type) {
        Product product = null;

        if(type.equalsIgnoreCase("simpleproduct")) {
            return new SimpleProduct();
        }
        if(type.equalsIgnoreCase("virtualproduct")) {
            return new VirtualProduct();
        }
        if(type.equalsIgnoreCase("advancedproduct")) {
            return new AdvancedProduct();
        }

        throw new IllegalArgumentException("Unkown product");
    }
}
