/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _7_ReverseInteger {
	/**
	 * Problem : https://leetcode.com/problems/reverse-integer/
	 * @param x
	 * @return
	 */
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
            res = res * 10 + x%10;
            x /= 10;
        }
        
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            return 0;
        }else{
            return (int)res;
        }
    }

}
