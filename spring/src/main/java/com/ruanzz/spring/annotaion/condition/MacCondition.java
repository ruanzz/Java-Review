package com.ruanzz.spring.annotaion.condition;

import java.util.Objects;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ZhenZhuo.Ruan
 */
public class MacCondition implements Condition {

  @Override
  public boolean matches(ConditionContext conditionContext,
      AnnotatedTypeMetadata annotatedTypeMetadata) {
    String osType = System.getProperty("os.name");
    if (Objects.nonNull(osType) && osType.toLowerCase().contains("mac") || osType.toLowerCase()
        .contains("darwin")) {
      return true;
    }

    // condition上下文可以获取IOC容器详细信息

    // bean 工厂
    ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();

    // 环境
    Environment environment = conditionContext.getEnvironment();

    // 注册bean springboot中自动配置大量使用
    BeanDefinitionRegistry registry = conditionContext.getRegistry();

    return false;
  }
}
