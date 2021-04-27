package test.ThreadPool;
//线程池的使用
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        //线程池生成及参数：核心线程数、最大线程数、空闲线程等待时间、时间单位、阻塞（等待）队列及长度、线程工厂（创建用）、拒绝策略
        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 7; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName() + "===>办理业务");
            });
        }
        //使用完关闭线程池
        executorService.shutdown();
    }
}
