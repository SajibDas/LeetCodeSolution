/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1309_DecryptStringFromAlphabetToIntegerMapping {
	/**
	 * Problem : https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
	 * @param s
	 * @return
	 */
    public String freqAlphabets(String s) {
        int len = s.length()-1;
        String res = "";
        while(len >= 0){
            if(s.charAt(len)=='#'){
                int value = (s.charAt(len-2) -48)*10 + (s.charAt(len-1)-48);
                res = (char)(value + 96) + res;
                len -= 3;
            }else{
                int value = (s.charAt(len) -48);
                res = (char)(value + 96) + res;
                len --;
            }
        }
        return res; 
    }

}
