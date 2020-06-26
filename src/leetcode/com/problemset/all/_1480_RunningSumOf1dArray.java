package leetcode.com.problemset.all;
/**
 * @author Sajib Kr Das
 */
public class _1480_RunningSumOf1dArray {
    /**
     * Problem : https://leetcode.com/problems/running-sum-of-1d-array/
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums;
        }else{
            int sum = nums[0];
            for(int i = 1; i < len; i++){
                sum += nums[i];
                nums[i] = sum;
            }
            return nums;
        }
    }
    
}