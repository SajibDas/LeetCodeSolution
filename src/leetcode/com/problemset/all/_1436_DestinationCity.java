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
public class _1436_DestinationCity {
	/**
	 * Problem : https://leetcode.com/problems/destination-city/
	 * @param paths
	 * @return
	 */
    public String destCity(List<List<String>> paths) {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < paths.size(); i++){
            if(!list.contains(paths.get(i).get(1))) list.add(paths.get(i).get(1));
            else list.remove(paths.get(i).get(1));
        }
        for(int i = 0; i < paths.size(); i++){
            if(list.contains(paths.get(i).get(0))) list.remove(paths.get(i).get(0));
        }
        return list.get(0);
        
    }

}
