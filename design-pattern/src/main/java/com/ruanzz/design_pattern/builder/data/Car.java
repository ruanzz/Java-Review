package com.ruanzz.design_pattern.builder.data;

/**
 * @author ZhenZhuo.Ruan
 */
public class Car {

  private Engine engine;

  private Seat seat;

  public Seat getSeat() {
    return seat;
  }

  public void setSeat(Seat seat) {
    this.seat = seat;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
        "engine=" + engine.getName() +
        ", seat=" + seat.getName() +
        '}';
  }
}
