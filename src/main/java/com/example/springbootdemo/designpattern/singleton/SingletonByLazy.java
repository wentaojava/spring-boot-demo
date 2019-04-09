package com.example.springbootdemo.designpattern.singleton;

/**
 * 单例模式
 * 懒汉式加载
 *
 * @author wentao
 * @time 2019年03月18日
 * @copyright Gods bless me,code never with bug.
 */
public class SingletonByLazy {
    private static SingletonByLazy instance = null;

    private SingletonByLazy() {

    }

    /**
     * 此创建方法运行效率较低，用synchronized加锁解锁会比较耗时
     *
     * @param
     * @return com.example.springbootdemo.designpattern.singleton.SingletonByLazy
     * @throws
     * @author wentao
     * @time 2019年03月18日
     * Gods bless me,code never with bug.
     */
    public static synchronized SingletonByLazy getInstance() {
        if (null == instance) {
            instance = new SingletonByLazy();

        }
        return instance;
    }

    /**
     * 此创建方法相对上一个方法，效率有所提升。只用synchronized包裹住实例不存在创建的过程
     * 相比于上一个方法来说，减少了实例存在的情况下直接返回的那部分效率
     *
     * @param
     * @return com.example.springbootdemo.designpattern.singleton.SingletonByLazy
     * @throws
     * @author wentao
     * @time 2019年03月18日
     * Gods bless me,code never with bug.
     */
    public static SingletonByLazy getInstanceOtherWay() {
        if (null == instance) {
            synchronized (SingletonByLazy.class) {
                if (null == instance) {
                    instance = new SingletonByLazy();
                }
            }

        }
        return instance;
    }
}
