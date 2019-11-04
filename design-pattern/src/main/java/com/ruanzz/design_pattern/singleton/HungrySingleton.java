package com.ruanzz.design_pattern.singleton;

/**
 * 饿汉式单例
 *
 * <p>1.构造函数私有化</p>
 * <p>2.静态变量实例一开始就是实例化 </p>
 * <p>3.提供一个公开的方法访问实例</p>
 *
 * @author ZhenZhuo.Ruan
 */
public class HungrySingleton {

  private static HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {

  }

  public static HungrySingleton getInstance() {
    return instance;
  }

  public static void main(String[] args) {
    System.out.println(HungrySingleton.getInstance() == HungrySingleton.getInstance());
  }


}
