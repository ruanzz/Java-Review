package com.ruanzz.design_pattern.proxy.staticproxy;

import com.ruanzz.design_pattern.proxy.CarMaker;

/**
 * 4儿子
 *
 * @author ZhenZhuo.Ruan
 */
public class Proxy4Son implements CarMaker {

  private CarMaker carMaker;

  public Proxy4Son(CarMaker carMaker) {
    this.carMaker = carMaker;
  }

  public void make() {
    carMaker.make();
  }

  public void sell() {
    System.out.println("4儿子代理销售");
  }
}
