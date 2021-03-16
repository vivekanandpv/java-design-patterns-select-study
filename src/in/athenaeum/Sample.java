package in.athenaeum;

public class Sample {
    private volatile static Sample instance;

    private Sample() {
    }

    public synchronized static Sample getInstance() {
        if (instance == null) {
            instance = new Sample();
            return instance;
        }

        return instance;
    }
}
