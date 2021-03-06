package com.ruanzz.design_pattern.factory.fatorymethod;

import com.ruanzz.design_pattern.factory.data.Car;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {

  public static void main(String[] args) {
    Car audi = new AudiFactory().createCar();
    audi.run();
    Car subaru = new SubaruFactory().createCar();
    subaru.run();
  }
}
