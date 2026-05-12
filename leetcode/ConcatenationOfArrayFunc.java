import java.util.Arrays;

public class ConcatenationOfArrayFunc {

    public void getConcatenationFuncFixedArr(int[] nums,int idx,int[] res){
        res[idx+nums.length-1]=res[idx-1]=nums[idx-1];
        if(idx==1){

        }else{
            getConcatenationFuncFixedArr(nums,idx-1,res);
        }
    }

    public int[] getConcatenationFunc(int[] nums){
        int[] res=new int[nums.length*2];
        int idx=nums.length;
        getConcatenationFuncFixedArr(nums,idx,res);
        return res;
    }

    public static void main(String[] args) {
        ConcatenationOfArrayFunc obj1=new ConcatenationOfArrayFunc();
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println( Arrays.toString( obj1.getConcatenationFunc(nums) ));
    }
}
