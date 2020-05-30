/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.HashSet;

/**
 * @author Sajib Kr. Das
 *
 */
public class _409_LongestPalindrome {
	/**
	 * Problem : https://leetcode.com/problems/longest-palindrome/
	 * @param s
	 * @return
	 */
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count++;
            }else{
                set.add(c);
            }    
        }
        if(!set.isEmpty()) return (count << 1) + 1;
        
        return count << 1;
    }

}
