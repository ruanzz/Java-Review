package com.ruanzz.design_pattern.proxy;

/**
 * @author ZhenZhuo.Ruan
 */
public class Vender implements CarMaker {

  public void make() {
    System.out.println("厂商产生");
  }

  public void sell() {
    System.out.println("厂商销售");
  }
}
