/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1299_ReplaceElementsWithGreatestElementOnRightSide {
	/**
	 * Problem : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
	 * @param arr
	 * @return
	 */
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        for(int i = 0; i < arr.length-1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i+1; j < arr.length; j++){
                max = arr[j] > max ? arr[j] : max;
            }
            arr[i] = max;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
