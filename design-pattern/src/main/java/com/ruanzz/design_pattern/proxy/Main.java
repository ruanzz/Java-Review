package com.ruanzz.design_pattern.proxy;

import com.ruanzz.design_pattern.proxy.staticproxy.Proxy4Son;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {

  public static void main(String[] args) {
    CarMaker carMaker = new Vender();
    Proxy4Son proxy4Son = new Proxy4Son(carMaker);
    proxy4Son.make();
    proxy4Son.sell();

  }

}
