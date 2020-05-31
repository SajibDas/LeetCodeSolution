/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _1323_Maximum69Number {
	/**
	 * Problem : https://leetcode.com/problems/maximum-69-number/
	 * @param num
	 * @return
	 */
    public int maximum69Number (int num) {
        String numStr = Integer.toString(num);
		char[] chArr = numStr.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] == '6'){
                chArr[i]='9';
                break;
            }
        }
		
       return Integer.parseInt(new String(chArr));
        
    }

}
