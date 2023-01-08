package observer.exercise;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("Set state to 12345");
        subject.setState(12345);
        System.out.println();
        System.out.println("Remove binaryObserver");
        subject.remove(binaryObserver);
        System.out.println("Set state to 54321");
        subject.setState(54321);
    }
}