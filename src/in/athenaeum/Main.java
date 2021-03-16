package in.athenaeum;

public class Main {

    public static void main(String[] args) {
	    Sample sample1 = Sample.getInstance();
	    Sample sample2 = Sample.getInstance();

        System.out.println(sample1 == sample2);
    }
}
