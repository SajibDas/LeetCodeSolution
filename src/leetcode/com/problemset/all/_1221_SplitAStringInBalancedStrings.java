/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1221_SplitAStringInBalancedStrings {
    /**
     * Problem : https://leetcode.com/problems/split-a-string-in-balanced-strings/
     * @param s
     * @return
     */
	public int balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        int countSplit = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'R':
                    countR++;
                    break;
                case 'L':
                    countL++;
                    break;
            }
            if(countR == countL){
                countSplit++;
                countR=0;
                countL=0;
            }
        }
        return countSplit;
    }

}
