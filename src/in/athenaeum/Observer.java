package in.athenaeum;

public abstract class Observer {
    protected final Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public abstract void update();

    public abstract void transmit(String message);
}
