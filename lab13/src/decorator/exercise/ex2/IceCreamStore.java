package decorator.exercise.ex2;

public class IceCreamStore {
    public static void main(String[] args) {
        IceCream vanilla = new VanillaIceCream();
        System.out.println(vanilla.getDescription());

        IceCream honeyVanilla = new HoneyToppingDecorator(vanilla);
        System.out.println(honeyVanilla.getDescription());
    }
}
