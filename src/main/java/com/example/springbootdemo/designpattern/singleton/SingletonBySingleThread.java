package com.example.springbootdemo.designpattern.singleton;

/**
 * 单例模式实现
 * 适用于单线程
 *
 * @author wentao
 * @time 2019年03月18日
 * @copyright Gods bless me,code never with bug.
 */
public class SingletonBySingleThread {
    private static SingletonBySingleThread instance = null;

    private SingletonBySingleThread() {

    }

    public static SingletonBySingleThread getInstance() {
        if (null == instance) {
            instance = new SingletonBySingleThread();
        }
        return instance;
    }
}
