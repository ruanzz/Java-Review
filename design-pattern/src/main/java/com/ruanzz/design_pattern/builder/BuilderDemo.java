package com.ruanzz.design_pattern.builder;

/**
 * @author ZhenZhuo.Ruan
 */
public class BuilderDemo {

  private String name;
  private String addr;

  public static BuilderDemo builder() {
    return new BuilderDemo();
  }

  public BuilderDemo name(String name) {
    this.name = name;
    return this;
  }

  public BuilderDemo addr(String addr) {
    this.addr = addr;
    return this;
  }

  @Override
  public String toString() {
    return "BuilderDemo{" +
        "name='" + name + '\'' +
        ", addr='" + addr + '\'' +
        '}';
  }

  public static void main(String[] args) {
    BuilderDemo demo = BuilderDemo.builder().name("Xiaoming").addr("Guangzhou Yuexiu");
    System.out.println(demo);
  }

}
