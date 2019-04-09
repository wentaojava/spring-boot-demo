package com.example.springbootdemo.designpattern.singleton;

/**
 * 单例模式-饿汉式加载
 *
 * @author wentao
 * @time 2019年03月18日
 * @copyright Gods bless me,code never with bug.
 */
public class SingletonByHungry {

    private static SingletonByHungry instance = new SingletonByHungry();
    private static String name = "饿汉式加载创建";

    private SingletonByHungry() {
    }

    public static SingletonByHungry getInstance() {
        return instance;
    }

    public void printCreaterName() {
        System.out.println("该类创建者是" + name);
    }

}
