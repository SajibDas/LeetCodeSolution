/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _171_ExcelSheetColumnNumber {
	/**
	 * Problem : https://leetcode.com/problems/excel-sheet-column-number/
	 * @param s
	 * @return
	 */
    public int titleToNumber(String s) {
        char[] charOfS= s.toCharArray();
        int len = s.length()-1;
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            int charVal = charOfS[len - i] -64;
            sum += Math.pow(26, i) * charVal;
        }
        return sum;
    }

}
