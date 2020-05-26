package leetcode.com.problemset.all;
/**
 * @author Sajib Kr. Das
 *
 */
public class _1108_DefangingAnIPAddress {
    /**
     * Problem : https://leetcode.com/problems/defanging-an-ip-address/
     * @param address
     * @return
     */
	public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
