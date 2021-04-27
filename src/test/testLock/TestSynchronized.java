package test.testLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestSynchronized {
    private int num = 0;

    private Lock fairLock = new ReentrantLock(true);
    public void test(){

        for (int i = 0; i < 1000; i++) {
            synchronized (this){//这里锁住代码块中的num输出，被保护的就是num++的操作
                System.out.println("Thread" + Thread.currentThread().getName() +", num:" + num++);
            }
        }
    }
}
