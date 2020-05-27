/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.HashMap;

/**
 * @author Sajib Kr. Das
 *
 */
public class _13_RomanToInteger {
	/**
	 * Problem : https://leetcode.com/problems/roman-to-integer/
	 * @param s
	 * @return
	 */
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] sChar = s.toCharArray();
		int len = s.length();
		int sum = map.get(sChar[len-1]);

		for(int i = len - 2; i >= 0; i--){
			if(map.get(sChar[i]) >= map.get(sChar[i+1])){
				sum += map.get(sChar[i]);
			}else{
				sum -= map.get(sChar[i]);
			}
		}
        return sum;
    }

}
