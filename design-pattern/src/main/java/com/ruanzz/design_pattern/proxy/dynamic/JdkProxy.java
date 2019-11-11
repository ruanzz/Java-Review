package com.ruanzz.design_pattern.proxy.dynamic;

import com.ruanzz.design_pattern.proxy.CarMaker;
import com.ruanzz.design_pattern.proxy.Vender;
import java.lang.reflect.Proxy;

/**
 * JDK自带的动态代理，被代理类有实现的接口
 *
 * @author ZhenZhuo.Ruan
 */
public class JdkProxy {

  public static void main(String[] args) {

    CarMaker carMaker = new Vender();

    CarMaker proxy = (CarMaker) Proxy
        .newProxyInstance(Vender.class.getClassLoader(), Vender.class.getInterfaces(),
            new VenderInvocationHandler(carMaker));

    proxy.make();
    proxy.sell();

  }

}
