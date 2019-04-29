package com.ruanzz.spring.annotaion.configuration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ZhenZhuo.Ruan
 */
public class MyImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
    return new String[]{"com.ruanzz.spring.bean.Blue"};
  }
}
