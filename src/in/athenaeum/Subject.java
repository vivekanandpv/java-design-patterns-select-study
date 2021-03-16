package in.athenaeum;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String message;
    private final List<Observer> invocationList;

    public Subject() {
        this.invocationList = new ArrayList<>();
    }

    public void register(Observer observer) {
        this.invocationList.add(observer);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.execute();
    }

    public void execute() {
        for(Observer observer: invocationList) {
            observer.update();
        }
    }
}
