/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.HashSet;

/**
 * @author Sajib Kr. Das
 *
 */
public class _202_HappyNumber {
	/**
	 * Problem : https://leetcode.com/problems/happy-number/
	 * @param n
	 * @return
	 */
    public boolean isHappy(int n) {
        if(n <= 0 ) return false;
        HashSet<Integer> set = new HashSet<Integer>();
        while(set.add(n)){
            n = squareOfDigits(n);
            if(n == 1){
                return true;
            }
            
        }
        return false;
        
    }
    private int squareOfDigits(int n ){
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += Math.pow(rem, 2);
            n /= 10;
        
        }
        return sum;
    }

}
