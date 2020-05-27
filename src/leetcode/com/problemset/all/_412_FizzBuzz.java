/**
 * 
 */
package leetcode.com.problemset.all;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sajib Kr. Das
 *
 */
public class _412_FizzBuzz {
	/**
	 * Problem : https://leetcode.com/problems/fizz-buzz/
	 * @param n
	 * @return
	 */
    public List<String> fizzBuzz(int n) {
        List<String> retList = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                retList.add("FizzBuzz");
            }else if(i%3 == 0){
                retList.add("Fizz");
            }else if(i%5 == 0){
                retList.add("Buzz");
            }else{
                retList.add(String.valueOf(i));
            }
        }
        return retList;
    }

}
