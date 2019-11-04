package com.ruanzz.design_pattern.singleton;

/**
 * 懒汉式单例
 *
 * <p>1.构造函数私有化</p>
 * <p>2.静态变量实例在第一次访问的的时候初始化，为了保证单例，需要加锁</p>
 * <p>3.提供一个公开的方法访问实例</p>
 *
 * @author ZhenZhuo.Ruan
 */
public class LazySingleton {

  private static LazySingleton instance = null;

  private LazySingleton() {

  }

  public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }

  public static void main(String[] args) {
    System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());
  }

}
