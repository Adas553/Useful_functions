package pl.coderslab.designpatterns.factory;

public class MainFactory {
    public static void main(String[] args) {

        ConcreteCreator concreteCreator = new ConcreteCreator();

        Product simpleProduct = concreteCreator.createProduct("simpleproduct");
        Product virtualProduct = concreteCreator.createProduct("virtualproduct");
        Product advancedProduct = concreteCreator.createProduct("advancedproduct");

        System.out.println(simpleProduct.getName());
        System.out.println(advancedProduct.getName());
        System.out.println(virtualProduct.getName());
        System.out.println(simpleProduct.getClass().getSimpleName());
    }
}
