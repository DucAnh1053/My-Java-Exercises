package factorymethod.exercise;

public class FruitFactory {
    Fruit provideFruit(String type) throws Exception {
        switch (type) {
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            case "orange":
                return new Orange();
        }
        throw new Exception("No matching fruit could be provided");
    }
}