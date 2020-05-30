/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1450_NumberOfStudentsDoingHomeworkAtAGivenTime {
	/**
	 * Problem : https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
	 * @param startTime
	 * @param endTime
	 * @param queryTime
	 * @return
	 */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
        int count = 0;
        
        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){

                count++;
            }
        }
        return count;
    }

}
