/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1389_CreateTargetArrayInTheGivenOrder {
    /**
     * Problem: https://leetcode.com/problems/create-target-array-in-the-given-order/
     * @param nums
     * @param index
     * @return
     */
	public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i = 0; i < index.length; i++){
            for(int j = index.length-1;  j > index[i]; j--){
                target[j]=target[j-1];
                
            }
            target[index[i]] = nums[i];
        
        }
        return target;
        
    }

}
