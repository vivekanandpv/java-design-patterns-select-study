package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer sObserver = new SmartphoneObserver(subject);
        Observer lObserver = new LaptopObserver(subject);

        subject.setMessage("Good evening!");

        sObserver.transmit("Hi there!");
    }
}
