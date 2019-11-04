package com.ruanzz.design_pattern.factory.abstractfactory;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {

  public static void main(String[] args) {
    CarFactory carFactory = new LuxuryCarFactory();
    carFactory.createEngine().start();
    carFactory.createSeat().feel();

    carFactory = new LowCarFactory();
    carFactory.createEngine().start();
    carFactory.createSeat().feel();
  }

}
