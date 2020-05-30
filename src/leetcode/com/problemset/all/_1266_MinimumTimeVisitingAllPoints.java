/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1266_MinimumTimeVisitingAllPoints {
	/**
	 * Problem : https://leetcode.com/problems/minimum-time-visiting-all-points/
	 * @param points
	 * @return
	 */
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length == 1){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < points.length-1; i++){
            int diffLeft = Math.abs(points[i][0]-points[i+1][0]);
            int diffRight = Math.abs(points[i][1]-points[i+1][1]);
            sum += Math.max(diffLeft,diffRight);
        }
        return sum;
    }

}
