package com.ruanzz.design_pattern.factory.abstractfactory;

import com.ruanzz.design_pattern.factory.abstractfactory.data.engine.Engine;
import com.ruanzz.design_pattern.factory.abstractfactory.data.engine.LowEngine;
import com.ruanzz.design_pattern.factory.abstractfactory.data.seat.LowSeat;
import com.ruanzz.design_pattern.factory.abstractfactory.data.seat.Seat;

/**
 * @author ZhenZhuo.Ruan
 */
public class LowCarFactory implements CarFactory {

  public Engine createEngine() {
    return new LowEngine();
  }

  public Seat createSeat() {
    return new LowSeat();
  }
}
