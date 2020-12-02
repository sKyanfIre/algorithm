package src.algorithm.leetcode;

/**
 * @author zhangtianyu
 * @version 1.0
 * @ClassName ReverseBits192
 * @description TODO
 * @date 2020/12/1 20:06
 **/
public class ReverseBits192 {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32;i++){
            result += (n & 1) << (31 - i);
            n >>= i;
        }
        return result;
    }
}
