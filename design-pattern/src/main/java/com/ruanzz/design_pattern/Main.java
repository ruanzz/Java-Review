package com.ruanzz.design_pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello Design Pattern");
    Collection<Integer> set = new HashSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(3);
    List<Integer> list = new ArrayList<Integer>(set);
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println(list);
  }
}
