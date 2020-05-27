/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.HashMap;

/**
 * @author Sajib Kr. Das
 *
 */
public class _387_FirstUniqueCharacterInAString {
	/**
	 * Problem : https://leetcode.com/problems/first-unique-character-in-a-string/
	 * @param s
	 * @return
	 */
    public int firstUniqChar(String s) {
        int len = s.length();
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i = 0; i < len; i ++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0)+1);
        }
        
        for(int j = 0; j < len; j++){
            if(count.get(s.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
        }

}
