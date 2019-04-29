package com.ruanzz.spring.bean;

/**
 * @author ZhenZhuo.Ruan
 */
public class Book {

  private String name;
  private Integer page;

  public Book() {
  }

  public Book(String name, Integer page) {
    this.name = name;
    this.page = page;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", page=" + page +
        '}';
  }
}

