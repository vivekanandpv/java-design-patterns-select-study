package in.athenaeum;

public class LaptopObserver extends Observer {
    public LaptopObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("LaptopObserver: " + this.subject.getMessage());
    }

    @Override
    public void transmit(String message) {
        this.subject.setMessage(message);
    }
}
