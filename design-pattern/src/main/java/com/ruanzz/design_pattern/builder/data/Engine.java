package com.ruanzz.design_pattern.builder.data;

/**
 * @author ZhenZhuo.Ruan
 */
public class Engine {

  private String name;

  public Engine(String name) {
    this.name = name;
  }

  public Engine() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
