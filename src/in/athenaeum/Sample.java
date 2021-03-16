package in.athenaeum;

public class Sample {
    private static Sample instance;

    private Sample() {
    }

    public static Sample getInstance() {
        if (instance == null) {
            instance = new Sample();
            return instance;
        }

        return instance;
    }
}
