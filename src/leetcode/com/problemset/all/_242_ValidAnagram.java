/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.Arrays;

/**
 * @author Sajib Kr. Das
 *
 */
public class _242_ValidAnagram {
	/**
	 * Problem : https://leetcode.com/problems/valid-anagram/
	 * @param s
	 * @param t
	 * @return
	 */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS, charT);
    }
}
