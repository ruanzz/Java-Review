package com.ruanzz.design_pattern.singleton;

/**
 * 双重锁检查式单例
 *
 * <p>1.构造函数私有化</p>
 * <p>2.静态变量实例在第一次访问的时候初始化，访问方法不需要加锁，使用双重检查锁与volatile内存可见性保证单例 </p>
 * <p>3.提供一个公开的方法访问实例</p>
 *
 * @author ZhenZhuo.Ruan
 */
public class DoubleCheckSingleton {

  private static volatile DoubleCheckSingleton instance = null;

  private DoubleCheckSingleton() {

  }

  public static DoubleCheckSingleton getInstance() {
    if (instance == null) {
      createInstance();
    }
    return instance;
  }

  private static synchronized void createInstance() {
    if (instance == null) {
      instance = new DoubleCheckSingleton();
    }
  }

  public static void main(String[] args) {
    System.out.println(DoubleCheckSingleton.getInstance() == DoubleCheckSingleton.getInstance());
  }
}
