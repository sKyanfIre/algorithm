package src.algorithm.sort;

/**
 * @author zhangtianyu
 * @version 1.0
 * @ClassName SelectSort
 * @description TODO
 * @date 2020/11/25 12:17
 **/
public class SelectSort {
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        short[] count = new short[26];
        for (char c : chars) {
            count[c - 'a'] += 1;
        }
        StringBuilder result = new StringBuilder();
        while ((result.length() < chars.length)) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    result.append((char) ('a' + i));
                    count[i] -= 1;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    result.append((char) ('a' + i));
                    count[i] -= 1;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abbabbaaab";
        System.out.println(reorganizeString(s));
    }

        public static String reorganizeString(String S) {
            char[] chars = S.toCharArray();
            short[] nums = new short[26];
            int maxNum = 0;
            int index = 0;
            for(char c : chars) {
                int tmp = ++nums[c - 'a'];
                if(tmp > maxNum) {
                    maxNum = tmp;
                    index = c - 'a';
                }
            }
            if(chars.length < maxNum * 2 -1)
                return "";
            StringBuilder result = new StringBuilder("");
            for(int i=0; i<maxNum;i++) {
                nums[index]--;
                result.append((char)(index+'a'));
                for(int j = 0,idx = 0; result.length() < chars.length && (j + 1) * maxNum < chars.length;idx++) {
                    if(idx == 26)
                        idx = 0;
                    if(idx != index && nums[idx] > 0){
                        j++;
                        nums[idx]--;
                        result.append((char)(idx + 'a'));
                    }
                }
            }
            return result.toString();
        }
}
