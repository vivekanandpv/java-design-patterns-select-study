package in.athenaeum;

public abstract class Observer<T> {
    protected final Subject<T> subject;

    public Observer(Subject<T> subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public abstract void update();

    public abstract void transmit(T message);
}
