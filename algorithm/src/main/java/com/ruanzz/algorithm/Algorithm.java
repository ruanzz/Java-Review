package com.ruanzz.algorithm;

/**
 * @author ZhenZhuo.Ruan
 */
public abstract class Algorithm implements IAlgorithm {

  public int[] unOrderedDataSet = new int[]{5, 6, 3, 2, 2, 9, 4, 10, 25, 21, 45, 22, 100, 12, 22};

  public int[] orderedDataSet = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

  protected long start = 0L;

  @Override
  public void preHandle() {
    System.out.println("***** Start Algorithm *****");
    System.out.println(String.format("Algorithm: %s ", this.getClass().getSimpleName()));
    initData();
    start = System.nanoTime();
  }

  @Override
  public void postHandle() {
    long end = System.nanoTime();
    System.out.println(String.format(" Duration: %d ns", (end - start)));
    System.out.println("***** End Algorithm *****");
  }

  protected abstract void initData();

}
