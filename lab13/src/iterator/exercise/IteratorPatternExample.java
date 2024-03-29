package iterator.exercise;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
