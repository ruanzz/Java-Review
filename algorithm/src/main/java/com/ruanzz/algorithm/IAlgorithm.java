package com.ruanzz.algorithm;

/**
 * @author ZhenZhuo.Ruan
 */
public interface IAlgorithm {

  default void excute() {
    preHandle();
    handle();
    postHandle();
  }

  void preHandle();

  void handle();

  void postHandle();


}
