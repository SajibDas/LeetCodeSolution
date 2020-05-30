/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _709_ToLowerCase {
	/**
	 * Problem : https://leetcode.com/problems/to-lower-case/
	 * @param str
	 * @return
	 */
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : str.toCharArray()){
            char newChar = c<91 && c>64 ? (char)(c+32) : c;
            sb.append(newChar);
        }
        return sb.toString();
    }

}
