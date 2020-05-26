package leetcode.com.problemset.all;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Sajib Kr. Das
 *
 */
public class _1431_KidsWithTheGreatestNumberOfCandies {
    
	/**
	 * Problem : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
	 * @param candies
	 * @param extraCandies
	 * @return
	 */
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i : candies){
            max = max < i ? i : max;
        }
        List<Boolean> kidsList = new ArrayList<Boolean>();
        for(int j : candies){
            if(max <= j+extraCandies){
                kidsList.add(true);
            }else{
                kidsList.add(false);
            }
        }
        return kidsList;
    }
}
