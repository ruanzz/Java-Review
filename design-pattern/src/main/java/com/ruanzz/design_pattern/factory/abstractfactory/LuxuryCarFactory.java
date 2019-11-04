package com.ruanzz.design_pattern.factory.abstractfactory;

import com.ruanzz.design_pattern.factory.abstractfactory.data.engine.Engine;
import com.ruanzz.design_pattern.factory.abstractfactory.data.engine.LuxuryEngine;
import com.ruanzz.design_pattern.factory.abstractfactory.data.seat.LuxurySeat;
import com.ruanzz.design_pattern.factory.abstractfactory.data.seat.Seat;

/**
 * @author ZhenZhuo.Ruan
 */
public class LuxuryCarFactory implements CarFactory {

  public Engine createEngine() {
    return new LuxuryEngine();
  }

  public Seat createSeat() {
    return new LuxurySeat();
  }
}
