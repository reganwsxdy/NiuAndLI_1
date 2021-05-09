package com.company.Tencent;
//使用双重校验锁的方式实现单例模式
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance =  new Singleton();
                }
            }
        }
        return instance;
    }
}

class Main{
    public static void main(String[] args) {
        //新声明的两个Singleton都指向内存的同一个位置
        Singleton s = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
    }
}
