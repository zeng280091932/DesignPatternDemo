package com.beauney.strategy.comparable;

/**
 * 对整型数组进行排序
 *
 * @author zengjiantao
 * @since 2020-07-27
 */
public class Sorter<T extends Comparable> {
    public void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
