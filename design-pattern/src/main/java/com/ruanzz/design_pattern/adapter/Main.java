package com.ruanzz.design_pattern.adapter;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {

  public static void main(String[] args) {
    Client client = new Client();
    Adaptee adaptee = new Adaptee();
    Target target = new Adapter(adaptee);
    client.request(target);
  }
}
