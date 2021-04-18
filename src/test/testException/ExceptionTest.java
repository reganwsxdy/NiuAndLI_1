package test.testException;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            process1();
            process2();
            ExceptionTest pr = new ExceptionTest();
            pr.process3();
        } catch (Exception e) {
            System.out.println("Unknown err");
        }

    }

    public static void process1(){}
    public static void process2(){}
    public void process3(){}

}
