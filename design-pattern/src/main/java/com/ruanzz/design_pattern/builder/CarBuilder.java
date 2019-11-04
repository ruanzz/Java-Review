package com.ruanzz.design_pattern.builder;

import com.ruanzz.design_pattern.builder.data.Engine;
import com.ruanzz.design_pattern.builder.data.Seat;

/**
 * @author ZhenZhuo.Ruan
 */
public interface CarBuilder {

  Engine buildEngine();

  Seat buildSeat();
}
