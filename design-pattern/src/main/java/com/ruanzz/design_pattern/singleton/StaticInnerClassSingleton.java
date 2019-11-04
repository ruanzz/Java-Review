package com.ruanzz.design_pattern.singleton;

/**
 * 静态内部类式单例
 *
 * <p>1.构造函数私有化</p>
 * <p>2.外部类没有静态变量，静态内部变量放在内部类中，第一次访问的时候才会加载内部类</p>
 * <p>3.提供一个公开的方法访问实例</p>
 *
 * @author ZhenZhuo.Ruan
 */
public class StaticInnerClassSingleton {

  private StaticInnerClassSingleton() {

  }

  public static StaticInnerClassSingleton getInstance() {
    return InstanceHolder.instance;
  }


  private static class InstanceHolder {

    private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
  }

  public static void main(String[] args) {
    System.out.println(
        StaticInnerClassSingleton.getInstance() == StaticInnerClassSingleton.getInstance());
  }


}


