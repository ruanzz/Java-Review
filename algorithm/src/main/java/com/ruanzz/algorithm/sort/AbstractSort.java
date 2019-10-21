package com.ruanzz.algorithm.sort;

import com.ruanzz.algorithm.Algorithm;
import java.util.Arrays;

/**
 * 排序抽象类
 *
 * @author ZhenZhuo.Ruan
 */
public class AbstractSort extends Algorithm {

  protected int[] arr;

  @Override
  protected void initData() {
    arr = unOrderedDataSet;
    System.out.println("  DataSet: " + Arrays.toString(arr));
  }

  @Override
  public void handle() {

  }

  @Override
  public void postHandle() {
    System.out.println("   Result: " + Arrays.toString(arr));
    super.postHandle();
  }

  protected void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
