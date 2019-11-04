package com.ruanzz.design_pattern.factory.fatorymethod;

import com.ruanzz.design_pattern.factory.data.Car;
import com.ruanzz.design_pattern.factory.data.Subaru;

/**
 * @author ZhenZhuo.Ruan
 */
public class SubaruFactory implements CarFactory {

  public Car createCar() {
    return new Subaru();
  }
}
