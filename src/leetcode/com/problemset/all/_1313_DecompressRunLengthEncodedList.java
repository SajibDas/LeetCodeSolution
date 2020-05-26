/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1313_DecompressRunLengthEncodedList {
    /**
     * Problem: https://leetcode.com/problems/decompress-run-length-encoded-list/
     * @param nums
     * @return
     */
	public int[] decompressRLElist(int[] nums) {
        List<Integer> intList = new ArrayList<Integer>();
        for(int i = 0; i<nums.length/2; i++){
            int freq = nums[2*i];
            int val = nums[2*i + 1];
            for(int j = 0; j < freq; j++){
                intList.add(val);
            }
        }
        int[] retInt = new int[intList.size()];
        for(int k = 0; k< intList.size(); k++){
            retInt[k] = intList.get(k);
        }
        return retInt;
    }
}
