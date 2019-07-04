"""Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single 
digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the 
number 0 itself.

https://leetcode.com/problems/add-two-numbers/
"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 is None:
            return l2
        
        if l2 is None:
            return l1
        
        add = l1.val + l2.val
        
        if add > 9:
            # carry the 1
            l1.next = self.addTwoNumbers(ListNode(1), l1.next)
            add = add - 10
            
        newNode = ListNode(add)
        newNode.next = self.addTwoNumbers(l1.next, l2.next)
        
        return newNode
