package com.ruanzz.design_pattern.singleton;

/**
 * 枚举式单例
 *
 * 枚举本身就是单例
 *
 * @author ZhenZhuo.Ruan
 */
public enum EnumSingleton {
  INSTANCE;

  public static void main(String[] args) {
    System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
  }
}
