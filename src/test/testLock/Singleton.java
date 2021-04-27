package test.testLock;

public class Singleton {
    //volatile是为了防止指令重新排序
    private static volatile Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        //第一次判空是为了防止线程阻塞
        if (instance == null){
            synchronized (Singleton.class){
                //第二次判空是为了防止两线程获到多个实例，不符合单例模式的初衷
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
