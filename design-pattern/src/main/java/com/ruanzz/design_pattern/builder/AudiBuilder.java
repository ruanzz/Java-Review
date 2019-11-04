package com.ruanzz.design_pattern.builder;

import com.ruanzz.design_pattern.builder.data.Engine;
import com.ruanzz.design_pattern.builder.data.Seat;

/**
 * @author ZhenZhuo.Ruan
 */
public class AudiBuilder implements CarBuilder {

  public Engine buildEngine() {
    return new Engine("V8");
  }

  public Seat buildSeat() {
    return new Seat("RECARO");
  }
}
