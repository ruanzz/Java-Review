package com.ruanzz.spring.annotaion.configuration;

import com.ruanzz.spring.bean.Yellow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ZhenZhuo.Ruan
 */
public class MyImportBeanDefinition implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
      BeanDefinitionRegistry beanDefinitionRegistry) {

    if (beanDefinitionRegistry.containsBeanDefinition("com.ruanzz.spring.bean.Red")) {
      beanDefinitionRegistry.registerBeanDefinition("yellow", new RootBeanDefinition(Yellow.class));
    }


  }
}
