/*
 * repeat array
 * */

import java.util.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums){
        int[] dupliNums=new int[nums.length*2];
        for(int i=1;i<=nums.length;i++){
            //dupliNums[i-1]=nums[i-1];
            dupliNums[i-1+nums.length]=dupliNums[i-1]=nums[i-1];
        }
        return dupliNums;
    }

    public static void main(String[] args) {
        ConcatenationOfArray obj1=new ConcatenationOfArray();
        int[] nums={1,3,2,1};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(obj1.getConcatenation(nums)));
    }
}
