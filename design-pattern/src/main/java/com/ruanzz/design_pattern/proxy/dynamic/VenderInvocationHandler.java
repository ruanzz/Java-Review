package com.ruanzz.design_pattern.proxy.dynamic;

import com.ruanzz.design_pattern.proxy.CarMaker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZhenZhuo.Ruan
 */
public class VenderInvocationHandler implements InvocationHandler {

  CarMaker carMaker;

  public VenderInvocationHandler(CarMaker carMaker) {
    this.carMaker = carMaker;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equals("sell")) {
      System.out.println("代理商在卖");
      return null;
    }
    return method.invoke(carMaker, args);
  }
}
