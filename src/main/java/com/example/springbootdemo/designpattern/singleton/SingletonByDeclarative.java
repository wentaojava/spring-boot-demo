package com.example.springbootdemo.designpattern.singleton;

/**
 * 单例模式-声明式
 * 即采用内部类形式创建
 *
 * @author wentao
 * @time 2019年03月18日
 * @copyright Gods bless me,code never with bug.
 */
public class SingletonByDeclarative {

    private SingletonByDeclarative() {

    }

    private static class Singleton {
        private final static SingletonByDeclarative instance = new SingletonByDeclarative();
    }

    public static SingletonByDeclarative getInstance() {
        return Singleton.instance;
    }



}
