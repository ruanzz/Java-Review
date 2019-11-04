package com.ruanzz.design_pattern.builder.data;

/**
 * @author ZhenZhuo.Ruan
 */
public class Seat {

  public String getName() {
    return name;
  }

  public Seat() {
  }

  public Seat(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

}
