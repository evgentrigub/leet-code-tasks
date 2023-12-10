package org.evgen;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList876 {
    void main(){
        var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var result = getMiddle(list);
        System.out.println("Result: " + result.val);
    }

    static ListNode getMiddle(ListNode head){
        ListNode middle = head;
        ListNode end = head;

        while (end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

