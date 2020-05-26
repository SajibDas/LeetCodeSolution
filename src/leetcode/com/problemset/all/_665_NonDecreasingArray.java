/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _665_NonDecreasingArray {
	/**
	 * Problem : https://leetcode.com/problems/non-decreasing-array/
	 * @param nums
	 * @return
	 */
    public boolean checkPossibility(int[] nums) {
	    int l = nums.length, cnt = 0;
	
	        for (int i = 0; i < l - 1 && cnt <= 1; ++i) {
	            if (nums[i] > nums[i + 1]) { // e.g. [2,2,3,2,4] 3>2
	                if (i > 0) {
	                    if (nums[i - 1] <= nums[i + 1]) // if number is lesser or equal modify nums[i]
	                        nums[i] = nums[i - 1];   // to the previous number. 2<=2 modify nums[i] =2
	                    else                          // in all other cases modify the next number
	                        nums[i + 1] = nums[i]; // to the current number to match// the sequence
	                }
	                ++cnt;
	            }
	        }
	        return cnt <= 1;
	    }

}
