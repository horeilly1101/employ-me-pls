/*
 * Add Two Numbers
 *
 * https://leetcode.com/problems/add-two-numbers/
 */

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        int add = l1.val + l2.val;
        
        if (add > 9) {
            // carry the 1
            l1.next = addTwoNumbers(new ListNode(1), l1.next);
            add -= 10;
        }
        
        ListNode newNode = new ListNode(add);
        newNode.next = addTwoNumbers(l1.next, l2.next);
        return newNode;
    }
}