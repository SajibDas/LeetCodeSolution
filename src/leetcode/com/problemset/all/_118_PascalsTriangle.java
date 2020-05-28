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
public class _118_PascalsTriangle {
	/**
	 * Problem : https://leetcode.com/problems/pascals-triangle/
	 * @param numRows
	 * @return
	 */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pTriangle = new ArrayList<List<Integer>>();
        
        if(numRows == 0){
            return pTriangle;
        }
        
        pTriangle.add(new ArrayList<Integer>());
        pTriangle.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> curRow = new ArrayList<Integer>();
            List<Integer> preRow = pTriangle.get(i-1);
            
            curRow.add(1);
            for(int j = 1; j < i; j++){
                curRow.add(preRow.get(j-1) + preRow.get(j));
            }
            curRow.add(1);
            pTriangle.add(curRow);
        }
        
        return pTriangle;
    }

}
