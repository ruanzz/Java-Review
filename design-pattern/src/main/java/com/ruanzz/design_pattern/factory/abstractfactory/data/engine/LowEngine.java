package com.ruanzz.design_pattern.factory.abstractfactory.data.engine;

/**
 * 低端引擎
 *
 * @author ZhenZhuo.Ruan
 */
public class LowEngine implements Engine {

  public void start() {
    System.out.println("start slowly");
  }

  public void run() {
    System.out.println("run slowly");
  }
}
