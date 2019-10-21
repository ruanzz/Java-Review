package com.ruanzz.algorithm.sort;

/**
 * <p>希尔排序</p>
 * 根据步长来选择分组，每次组内排序，改变步长，直到步长为1
 *
 * @author ZhenZhuo.Ruan
 */
public class ShellSort extends AbstractSort {

  @Override
  public void handle() {
    for (int step = arr.length / 2; step > 0; step = step / 2) {
      // 根据步长分组之后排序
      for (int i = step; i < arr.length; i++) {
        for (int j = i - step; j >= 0; j -= step) {
          if (arr[j] > arr[j + step]) {
            swap(arr, j, j + step);
          }
        }
      }
    }

  }
}
