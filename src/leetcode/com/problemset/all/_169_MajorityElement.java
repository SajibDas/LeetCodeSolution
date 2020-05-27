/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.Arrays;

/**
 * @author Sajib Kr. Das
 *
 */
public class _169_MajorityElement {
	/**
	 * Problem : https://leetcode.com/problems/majority-element/
	 * @param nums
	 * @return
	 */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
