package com.ruanzz.algorithm.sort;

/**
 * <p>选择排序</p>
 * 从左往后找，第一次找最小的数字，第二次找第二小的数字，一次类推
 *
 * @author ZhenZhuo.Ruan
 */
public class SelectSort extends AbstractSort {

  @Override
  public void handle() {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }
      if (i != minIndex) {
        swap(arr, i, minIndex);
      }
    }
  }
}
