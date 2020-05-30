/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _53_MaximumSubarray {
	/**
	 * Problem : https://leetcode.com/problems/maximum-subarray/
	 * @param nums
	 * @return
	 */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums){
            sum = Math.max(sum, 0) + num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
