/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.Arrays;

/**
 * @author Sajib Kr. Das
 *
 */
public class _217_ContainsDuplicate {
	/**
	 * Problem : https://leetcode.com/problems/contains-duplicate/
	 * @param nums
	 * @return
	 */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; ++i){
                if(nums[i] == nums[i+1]){
                    return true;
            }
        }
        return false;
        
    }

}
