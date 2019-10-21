package com.ruanzz.algorithm.search;

import java.util.Arrays;

/**
 * <p>二分查找</p>
 *
 * 目标值比中间值大，往右边找，比中间值小，往左边找，以此递归
 *
 * @author ZhenZhuo.Ruan
 */
public class BinarySearch extends AbstractSearch {

  private int[] arr = null;

  private int target = 3;

  @Override
  protected void initData() {
    arr = orderedDataSet;
    System.out.println("  DataSet: " + Arrays.toString(arr));
  }

  @Override
  public void handle() {
    int start = 0;
    int end = arr.length - 1;
    int mid = (start + end) / 2;
    int index = -1;
    while (true) {
      if (arr[mid] == target) {
        index = mid;
        break;
      } else if (arr[mid] > target) {
        end = mid - 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      }
      mid = (start + end) / 2;
    }
    System.out.println("   Result: " + index);
  }
}
