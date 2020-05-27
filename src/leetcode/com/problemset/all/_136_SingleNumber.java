/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _136_SingleNumber {
	/**
	 * Problem : https://leetcode.com/problems/single-number/
	 * @param nums
	 * @return
	 */
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for(int num : nums){
            singleNum ^= num;
            
        }
        return singleNum;
    }

}
