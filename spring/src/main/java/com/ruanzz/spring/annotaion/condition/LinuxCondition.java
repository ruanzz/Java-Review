package com.ruanzz.spring.annotaion.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ZhenZhuo.Ruan
 */
public class LinuxCondition implements Condition {

  @Override
  public boolean matches(ConditionContext conditionContext,
      AnnotatedTypeMetadata annotatedTypeMetadata) {
    return false;
  }
}
