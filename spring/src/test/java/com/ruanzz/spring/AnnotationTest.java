package com.ruanzz.spring;

import com.ruanzz.spring.annotaion.configuration.Config;
import com.ruanzz.spring.bean.Blue;
import com.ruanzz.spring.bean.Book;
import com.ruanzz.spring.bean.Color;
import com.ruanzz.spring.bean.ColorFactoryBean;
import com.ruanzz.spring.bean.Red;
import java.util.Objects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {

  private ApplicationContext applicationContext;

  @Before
  public void setUp() throws Exception {
    applicationContext = new AnnotationConfigApplicationContext(
        Config.class);
    System.out.println("init ioc finished!");
  }

  @After
  public void tearDown() throws Exception {
  }


  @Test
  public void testAnnotation() {
    System.out.println("testAnnotation...");
    Book book = (Book) applicationContext.getBean("book");
    assert "annotation".equals(book.getName()) && book.getPage() == 200;
  }

  @Test
  public void testAnnotationComponentScan() {
    System.out.println("testAnnotationComponentScan...");
    assert !Objects.isNull(applicationContext.getBean("bookController"));
    assert !Objects.isNull(applicationContext.getBean("bookService"));
    assert !Objects.isNull(applicationContext.getBean("bookDao"));
  }

  @Test
  public void testScope() {
    System.out.println("testScope....");
    assert applicationContext.getBean("book") == applicationContext.getBean("book");
    assert applicationContext.getBean("book1") != applicationContext.getBean("book1");
  }

  @Test
  public void testCondition() {
    Object book = applicationContext.getBean("book2");
    System.out.println(book);
  }

  @Test
  public void testImport() {
    assert Objects.nonNull(applicationContext.getBean(Blue.class));
    assert Objects.nonNull(applicationContext.getBean(Red.class));
    assert Objects.nonNull(applicationContext.getBean("yellow"));
  }

  @Test
  public void testFactoryBean() {
    Object colorBean = applicationContext.getBean("colorFactoryBean");
    assert colorBean.getClass() == Color.class;
    Object colorFactoryBean = applicationContext.getBean("&colorFactoryBean");
    assert colorFactoryBean.getClass() == ColorFactoryBean.class;

  }
}
