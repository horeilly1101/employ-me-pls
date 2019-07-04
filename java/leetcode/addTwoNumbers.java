/* Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single 
 * digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the 
 * number 0 itself.
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