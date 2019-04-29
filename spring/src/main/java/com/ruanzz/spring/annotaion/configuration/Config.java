package com.ruanzz.spring.annotaion.configuration;

import com.ruanzz.spring.annotaion.condition.MacCondition;
import com.ruanzz.spring.bean.Book;
import com.ruanzz.spring.bean.ColorFactoryBean;
import com.ruanzz.spring.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author ZhenZhuo.Ruan
 * @Configuration 代表一个配置文件
 */
@Configuration
@ComponentScan(value = "com.ruanzz.spring")
@Import({Red.class, MyImportSelector.class, MyImportBeanDefinition.class})
public class Config {

  //  @Bean("book") //指定id
  @Bean // 方法名为id
  @Lazy  //懒加载，IOC容器创建的时候不会被加载，第一次获取bean的时候才会被加载
  public Book book() {
    System.out.println("Singleton");
    return new Book("annotation", 200);
  }

  @Bean("book1")
  @Scope("prototype")
  public Book bookPrototype() {
    System.out.println("prototype");
    return new Book("prototype", 200);
  }


  @Bean("book2")
  @Conditional({MacCondition.class})
  public Book bookCondition() {
    return new Book("condition", 200);
  }

  /**
   * 加入容器，实际上加入的是Color的实例
   */
  @Bean
  public ColorFactoryBean colorFactoryBean() {
    return new ColorFactoryBean();
  }

}
