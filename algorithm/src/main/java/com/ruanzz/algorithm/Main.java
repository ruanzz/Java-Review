package com.ruanzz.algorithm;


import com.ruanzz.algorithm.sort.MergeSort;

/**
 * @author ZhenZhuo.Ruan
 */
public class Main {

  public static void main(String[] args) {
    IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(MergeSort.class);
    algorithm.excute();
  }

}
