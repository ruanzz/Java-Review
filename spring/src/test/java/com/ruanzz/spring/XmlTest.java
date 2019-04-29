package com.ruanzz.spring;

import com.ruanzz.spring.bean.Book;
import java.util.Objects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {

  private ApplicationContext applicationContext;

  @Before
  public void setUp() throws Exception {
    applicationContext = new ClassPathXmlApplicationContext(
        "bean.xml");
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testXml() throws Exception {
    Book book = (Book) applicationContext.getBean("book");
    assert "xml".equals(book.getName()) && book.getPage() == 100;
  }

  @Test
  public void testXmlComponentScan() {
    assert !Objects.isNull(applicationContext.getBean("bookController"));
    assert !Objects.isNull(applicationContext.getBean("bookService"));
    assert !Objects.isNull(applicationContext.getBean("bookDao"));

  }


  @Test
  public void testXmlScope() {
    assert applicationContext.getBean("book") == applicationContext.getBean("book");
    assert applicationContext.getBean("book1") != applicationContext.getBean("book1");
  }

}
