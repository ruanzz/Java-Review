package com.ruanzz.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZhenZhuo.Ruan
 */
public class ColorFactoryBean implements FactoryBean {

  /**
   * 返回一个对象加入容器
   */
  @Override
  public Object getObject() throws Exception {
    return new Color();
  }

  /**
   * 返回class类型
   */
  @Override
  public Class<?> getObjectType() {
    return Color.class;
  }

  /**
   * 是否单例
   */
  @Override
  public boolean isSingleton() {
    return true;
  }
}
