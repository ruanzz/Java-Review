package com.ruanzz.algorithm.sort;

/**
 * <p>冒泡排序</p>
 * 每次遍历都把最大的数放到右边，所以要比较相邻的两个数，左边比右边大则交换
 *
 * @author ZhenZhuo.Ruan
 */
public class BubbleSort extends AbstractSort {

  @Override
  public void handle() {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
  }
}
