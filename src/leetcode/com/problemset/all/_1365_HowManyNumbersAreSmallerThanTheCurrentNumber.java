/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    /**
     * Problem: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
     * @param nums
     * @return
     */
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] returnInt = new int[nums.length];
        for(int i = 0; i <nums.length; i++ ){
            int count = 0;
            for(int j : nums){
                if(nums[i] > j){
                    count++;
                    
                }
            }
            returnInt[i]= count;
        }
        return returnInt;
    }
}
