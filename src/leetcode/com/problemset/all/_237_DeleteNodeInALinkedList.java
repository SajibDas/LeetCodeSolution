/**
 * 
 */
package leetcode.com.problemset.all;

/**
 * @author Sajib Kr. Das
 *
 */
public class _237_DeleteNodeInALinkedList {
	/**
	 * Problem : https://leetcode.com/problems/delete-node-in-a-linked-list/
	 * @param node
	 */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    // Definition for singly-linked list.
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
