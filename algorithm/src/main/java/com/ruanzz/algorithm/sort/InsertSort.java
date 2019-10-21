package com.ruanzz.algorithm.sort;

/**
 * <p>插入排序</p>
 * 从头到尾遍历数组，遍历到的元素的左边要保证有序，相当于每次都是把一个元素插入一个有序的数组里边
 *
 * @author ZhenZhuo.Ruan
 */
public class InsertSort extends AbstractSort {

  @Override
  public void handle() {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        int temp = arr[i];
        int j;
        for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
          arr[j + 1] = arr[j];
        }
        arr[j + 1] = temp;
      }
    }
  }
}
