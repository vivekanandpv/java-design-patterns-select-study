package in.athenaeum;

public class SmartphoneObserver<T> extends Observer<T> {

    public SmartphoneObserver(Subject<T> subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("SmartphoneObserver: " + this.subject.getMessage());
    }

    @Override
    public void transmit(T value) {
        this.subject.setMessage(value);
    }


}
