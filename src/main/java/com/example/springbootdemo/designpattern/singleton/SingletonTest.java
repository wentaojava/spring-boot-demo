package com.example.springbootdemo.designpattern.singleton;

/**
 * 单例模式测试类
 *
 * @author wentao
 * @time 2019年03月18日
 * @copyright Gods bless me,code never with bug.
 */
public class SingletonTest {

    public static class ThreadTest implements Runnable{
        @Override
        public void run() {
            System.out.println( SingletonByDeclarative.getInstance());
        }
    }

    public static void main(String[] args) {
        //创建多个线程，每个线程获取一个单例模式的对象，并调用该对象的方法输出语句
        for (int i=0;i<10;i++){
            ThreadTest threadTest=new ThreadTest();
            new Thread(threadTest).start();
        }
    }


}
