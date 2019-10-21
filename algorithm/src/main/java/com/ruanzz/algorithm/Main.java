package com.ruanzz.algorithm;


import com.ruanzz.algorithm.sort.SelectSort;

/**
 * @author ZhenZhuo.Ruans
 */
public class Main {

  public static void main(String[] args) {
    IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(SelectSort.class);
    algorithm.excute();
  }

}
