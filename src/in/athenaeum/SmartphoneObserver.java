package in.athenaeum;

public class SmartphoneObserver extends Observer {

    public SmartphoneObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("SmartphoneObserver: " + this.subject.getMessage());
    }

    @Override
    public void transmit(String message) {
        this.subject.setMessage(message);
    }
}
