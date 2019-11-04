package com.ruanzz.design_pattern.factory.abstractfactory.data.engine;

/**
 * 豪华引擎
 *
 * @author ZhenZhuo.Ruan
 */
public class LuxuryEngine implements Engine {

  public void start() {
    System.out.println("start quickly");
  }

  public void run() {
    System.out.println("run quickly");
  }
}
