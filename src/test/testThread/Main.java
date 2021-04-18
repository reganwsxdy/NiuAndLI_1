package test.testThread;

public class Main {
    public static void main(String[] args) {
        TestSynchronized sync = new TestSynchronized();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sync.test();
            }
        }
        );

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sync.test();
            }
        }
        );

        t1.start();
        t2.start();
    }
}
