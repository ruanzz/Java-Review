package com.ruanzz.algorithm.sort;

/**
 * <p>归并排序</p>
 *
 * 把一个数组分为左右两个数组，然后对这两个数组做整体的插入排序，以此递归
 *
 * @author ZhenZhuo.Ruan
 */
public class MergeSort extends AbstractSort {

  @Override
  public void handle() {
    mergeSort(arr, 0, arr.length - 1);
  }

  private void mergeSort(int[] arr, int low, int high) {
    int mid = (low + high) / 2;
    if (low < high) {
      // 处理左边
      mergeSort(arr, low, mid);

      // 处理右边
      mergeSort(arr, mid + 1, high);

      // 排序
      merge(arr, low, mid, high);
    }
  }

  private void merge(int[] arr, int low, int mid, int hight) {
    int i = low;
    int j = mid + 1;
    int[] temp = new int[hight - low + 1];
    int index = 0;
    while (i <= mid && j <= hight) {
      if (arr[i] <= arr[j]) {
        temp[index] = arr[i];
        i++;
      } else {
        temp[index] = arr[j];
        j++;
      }
      index++;
    }
    // 将未处理到的数据直接放到temp数组后边
    while (i <= mid) {
      temp[index] = arr[i];
      i++;
      index++;
    }

    while (j <= hight) {
      temp[index] = arr[j];
      index++;
      j++;
    }

    // 将归并排序的temp数组放回arr中
    for (int k = 0; k < temp.length; k++) {
      arr[low + k] = temp[k];
    }

  }


}
