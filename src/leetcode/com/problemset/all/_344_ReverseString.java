/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _344_ReverseString {
	/**
	 * Problem : https://leetcode.com/problems/reverse-string/
	 * @param s
	 */
    public void reverseString(char[] s) {
        int len = s.length;
        for(int i = len-1; i >= len/2; i--){
            char first = s[len-1-i];
            char last = s[i];
            s[len-1-i] = last;
            s[i]=first;
        }
        
    }
}
