package com.ruanzz.design_pattern.builder;

import com.ruanzz.design_pattern.builder.data.Car;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {


  public static void main(String[] args) {
    Car car = new CarDirector(new AudiBuilder()).direct();
    System.out.println(car);
  }

}
