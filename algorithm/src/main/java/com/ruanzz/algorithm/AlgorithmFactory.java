package com.ruanzz.algorithm;

/**
 * 排序工厂类
 *
 * @author ZhenZhuo.Ruan
 */
public class AlgorithmFactory {

  public static IAlgorithm getAlgorithm(Class<? extends IAlgorithm> clazz) {
    try {
      return clazz.newInstance();
    } catch (InstantiationException e) {
      System.out.println("实例化出现错误");
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      System.out.println("实例化出现非法访问错误");
      e.printStackTrace();
    }
    return null;
  }
}
