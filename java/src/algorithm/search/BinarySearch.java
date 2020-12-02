package src.algorithm.search;

import java.util.Arrays;

/**
 * @author zhangtianyu
 * @version 1.0
 * @ClassName BinarySearch
 * @description TODO
 * @date 2020/12/1 17:43
 **/
public class BinarySearch {
    public static int search(int[] arr,int target,int left,int right){
        if(arr.length == 0) return -1;
        int mid = (left + right)/2;
        if(left > right) return -1;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) left = mid + 1;
        if(arr[mid] > target) right = mid - 1;
        return search(arr,target,left,right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};
        System.out.println(Arrays.toString(searchRange(arr,1)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int index = search(nums,target,0,nums.length - 1);
        if(index == -1)
            return new int[]{-1,-1};
        int start = index;
        int end = index;
        for(int i = index ;i >= 0;i--) {
            if(nums[i] == target) {
                start = i;
            }
            else{
                break;
            }
        }
        for(int i = index ;i < nums.length;i++) {
            if(nums[i] == target) {
                end = i;
            }
            else{
                break;
            }
        }
        return new int[]{start,end};
    }
}
