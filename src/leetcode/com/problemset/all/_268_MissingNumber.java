/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.Arrays;

/**
 * @author Sajib Kr. Das
 *
 */
public class _268_MissingNumber {
	/**
	 * Problem : https://leetcode.com/problems/missing-number/
	 * @param nums
	 * @return
	 */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(nums[len-1] != len){
            return len;
        }
        for(int i = 0; i < len; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return -1;
    }

}
