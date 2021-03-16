package in.athenaeum;

public class Main {

    public static void main(String[] args) {
        Subject<String> subject = new Subject<>();
        Observer<String> sObserver = new SmartphoneObserver<>(subject);
        Observer<String> lObserver = new LaptopObserver<>(subject);

        subject.setMessage("Good evening!");
    }
}
