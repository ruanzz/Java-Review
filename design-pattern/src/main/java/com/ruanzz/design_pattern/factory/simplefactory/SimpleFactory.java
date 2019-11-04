package com.ruanzz.design_pattern.factory.simplefactory;

import com.ruanzz.design_pattern.factory.data.Audi;
import com.ruanzz.design_pattern.factory.data.Car;
import com.ruanzz.design_pattern.factory.data.Subaru;

/**
 * 简单工厂模式/静态工厂模式
 *
 * @author ZhenZhuo.Ruan
 */
public class SimpleFactory {

  public static Car createCar(Class<? extends Car> clazz)
      throws IllegalAccessException, InstantiationException {
    return (Car) clazz.newInstance();
  }

  public static Car createAudi() {
    return new Audi();
  }

  public static Car createSubaru() {
    return new Subaru();
  }

  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    Car subaru = SimpleFactory.createCar(Subaru.class);
    subaru.run();

    subaru = SimpleFactory.createSubaru();
    subaru.run();

    Car audi = SimpleFactory.createAudi();
    audi.run();

  }

}
