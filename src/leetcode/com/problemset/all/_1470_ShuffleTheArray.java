/*
 * @Author: Sajib Kr Das 
 * @Date: 2020-06-26 23:36:20 
 * @Last Modified by:   Sajib Kr Das 
 * @Last Modified time: 2020-06-26 23:36:20 
 */
package leetcode.com.problemset.all;

public class _1470_ShuffleTheArray {
    /**
     * Problem : https://leetcode.com/problems/shuffle-the-array/
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        if(n == 1){
            return nums;
        }else{
            int[] res = new int[2*n];
            int index = 0;
            for(int i = 0; i < n;i++){
                res[index++]= nums[i];
                res[index++] = nums[n + i];
                
            }
            return res;
        }
    }
}