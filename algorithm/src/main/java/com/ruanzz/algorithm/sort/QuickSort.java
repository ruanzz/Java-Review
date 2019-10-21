package com.ruanzz.algorithm.sort;

/**
 * <p>快速排序</p>
 * 找到一个基准值，然后左右两个指针交换寻找元素进行替换，使得基准值左边都比基准值小，右边都比基准值大，以此递归
 *
 * @author ZhenZhuo.Ruan
 */
public class QuickSort extends AbstractSort {

  @Override
  public void handle() {
    quickSort(arr, 0, arr.length - 1);
  }

  private static void quickSort(int[] arr, int start, int end) {

    // 递归终止条件
    if (start >= end) {
      return;
    }

    int standard = arr[start];
    int low = start;
    int high = end;
    while (low < high) {

      // 从右边开始，寻找比标准数小的数
      while (low < high && arr[high] >= standard) {
        high--;
      }
      arr[low] = arr[high];

      // 然后反方向查找，寻找比标准数大的数
      while (low < high && arr[low] <= standard) {
        low++;
      }
      arr[high] = arr[low];
    }
    arr[low] = standard;

    // 递归
    quickSort(arr, start, low);
    quickSort(arr, low + 1, end);
  }
}
