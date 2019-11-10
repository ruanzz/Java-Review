package com.ruanzz.design_pattern.adapter;

/**
 * @author ZhenZhuo.Ruan
 */
public class Adapter implements Target {

  Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public void request() {
    adaptee.test();
  }
}
