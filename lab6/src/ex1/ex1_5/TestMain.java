package ex1.ex1_5;

public class TestMain {
    public static void main(String[] args) {
        Cat myCat = new Cat("Chó");
        Dog myDog = new Dog("Mèo");
        System.out.println(myCat);
        System.out.println(myDog);
        myCat.greets();
        myDog.greets();
    }
}
