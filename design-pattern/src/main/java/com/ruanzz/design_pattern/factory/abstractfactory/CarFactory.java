package com.ruanzz.design_pattern.factory.abstractfactory;

import com.ruanzz.design_pattern.factory.abstractfactory.data.engine.Engine;
import com.ruanzz.design_pattern.factory.abstractfactory.data.seat.Seat;

/**
 * @author ZhenZhuo.Ruan
 */
public interface CarFactory {

  Engine createEngine();

  Seat createSeat();

}
