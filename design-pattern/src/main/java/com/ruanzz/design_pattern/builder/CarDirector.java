package com.ruanzz.design_pattern.builder;

import com.ruanzz.design_pattern.builder.data.Car;
import com.ruanzz.design_pattern.builder.data.Engine;
import com.ruanzz.design_pattern.builder.data.Seat;

/**
 * @author ZhenZhuo.Ruan
 */
public class CarDirector {


  private CarBuilder builder;

  public CarDirector(CarBuilder builder) {
    this.builder = builder;
  }

  public CarDirector() {
  }

  public Car direct() {
    Engine engine = builder.buildEngine();
    Seat seat = builder.buildSeat();
    Car car = new Car();
    car.setEngine(engine);
    car.setSeat(seat);
    return car;
  }

}
