package com.ruanzz.design_pattern.factory.fatorymethod;

import com.ruanzz.design_pattern.factory.data.Audi;
import com.ruanzz.design_pattern.factory.data.Car;

/**
 * @author ZhenZhuo.Ruan
 */
public class AudiFactory implements CarFactory {

  public Car createCar() {
    return new Audi();
  }
}
