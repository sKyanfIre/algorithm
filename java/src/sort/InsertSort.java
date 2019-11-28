package sort;

import java.util.Arrays;

/**
 * @author zzz
 * @description 插入排序
 * @date 2019/11/28
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 43, 1, 34, 234, 6, 35};
        sort(a);
        System.out.println(Arrays.toString(a));
        sortByReverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //插入元素
            int insertElement = array[i];
            //插入时第一次比较的元素位置
            int j = i - 1;
            while (j >= 0 && array[j] > insertElement) {
                array[j + 1] = array[j];
                j = j - 1;

            }
            //找到新插入元素的位置
            array[j + 1] = insertElement;
        }

    }

    public static void sortByReverse(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //插入元素
            int insertElement = array[i];
            //插入时第一次比较的元素
            int j = i - 1;
            while (j >= 0 && array[j] < insertElement) {
                array[j + 1] = array[j];
                j = j - 1;

            }
            //找到新插入元素的位置
            array[j + 1] = insertElement;
        }

    }
}
