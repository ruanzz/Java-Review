package com.ruanzz.design_pattern.prototype;

/**
 * @author ZhenZhuo.Ruan
 */
public class Sheep implements Cloneable {

  private String name;

  public Sheep(String name) {
    this.name = name;
  }

  public Sheep() {
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Sheep{" +
        "name='" + name + '\'' +
        '}';
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Sheep sheep = new Sheep("Sheep");
    Sheep duoli = (Sheep) sheep.clone();
    duoli.setName("Duoli");
    System.out.println(sheep);
    System.out.println(duoli);
  }


}
