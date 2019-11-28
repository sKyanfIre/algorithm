package sort;

import java.util.Arrays;

/**
 * @author zzz
 * @description 归并排序
 * @date 2019/11/28
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {3,4,23,1,3,42,12,63,23,1,7,0,32,45,234};
        sort(array);
    }
    public static void sort(int[] array){
        if(array.length > 1) {
            //将数组分为两部分
            int[] left = new int[array.length / 2];
            int[] right = new int[array.length - array.length / 2];
            for(int i = 0 ; i < left.length;i++){
                left[i] = array[i];
            }
            for(int j = 0 ; j < right.length; j++){
                right[j] = array[j + array.length / 2];
            }
            System.out.println("left:"+ Arrays.toString(left) + "right:" + Arrays.toString(right));

            sort(left);
            sort(right);
            merge(left,right,array);
            System.out.println("merge:" + Arrays.toString(array));
        }
    }

    /**
     *  合并 并排序两个数组
     */
    public static void merge(int[] left,int[] right,int[] total){
        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = 0 ; i < total.length; i++){
            if(leftIndex == left.length && rightIndex < right.length){
                total[i] = right[rightIndex];
                rightIndex = rightIndex + 1;
            }
            if(rightIndex == right.length && leftIndex < left.length){
                total[i] = left[leftIndex];
                leftIndex = leftIndex + 1;
            }
            if(rightIndex < right.length && leftIndex < left.length){

                if(left[leftIndex] > right[rightIndex]){
                    total[i] = right[rightIndex];
                    rightIndex = rightIndex + 1;
                }else{
                    total[i] = left[leftIndex];
                    leftIndex = leftIndex + 1;
                }
            }
        }
    }
}
