package in.athenaeum;

public class LaptopObserver<T> extends Observer<T> {
    public LaptopObserver(Subject<T> subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("LaptopObserver: " + this.subject.getMessage());
    }

    @Override
    public void transmit(T value) {
        this.subject.setMessage(value);
    }
}
