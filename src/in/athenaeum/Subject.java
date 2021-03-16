package in.athenaeum;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    private T value;
    private final List<Observer<T>> invocationList;

    public Subject() {
        this.invocationList = new ArrayList<>();
    }

    public void register(Observer<T> observer) {
        this.invocationList.add(observer);
    }

    public T getMessage() {
        return value;
    }

    public void setMessage(T message) {
        this.value = message;
        this.execute();
    }

    public void execute() {
        for(Observer<T> observer: invocationList) {
            observer.update();
        }
    }
}
