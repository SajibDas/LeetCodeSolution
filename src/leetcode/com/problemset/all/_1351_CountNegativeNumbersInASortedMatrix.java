/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1351_CountNegativeNumbersInASortedMatrix {
	/**
	 * Problem : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
	 * @param grid
	 * @return
	 */
    public int countNegatives(int[][] grid) {
        int count = 0;
        
        for(int i=0; i < grid.length; i++){
            int[] intArr = grid[i];
            for(int j = intArr.length-1 ; j >= 0; j--){
                if(intArr[j] >= 0){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
