/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1295_FindNumbersWithEvenNumberOfDigits {
    /**
     * Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
     * @param nums
     * @return
     */
	public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(String.valueOf(num).length()%2 == 0){
                count++;
            }
        }
        return count;
        
    }
}
