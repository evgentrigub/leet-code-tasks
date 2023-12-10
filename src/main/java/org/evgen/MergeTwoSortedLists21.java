package org.evgen;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
// https://hyperskill.org/learn/step/32032
public class MergeTwoSortedLists21 {
    public static void run() {
        var list1 = new ListNode(1,
                new ListNode(3, new ListNode(5,
                        new ListNode(6))));
        var list2 = new ListNode(2,
                new ListNode(4, new ListNode(6,
                        new ListNode(7, new ListNode(9)))));

        ListNode result = merge(list1, list2);
        System.out.println(result);

//        var list3 = new ListNode(2,
//                new ListNode(2, new ListNode(4,
//                        new ListNode(4, new ListNode(4)))));
//        var res2 = removeDuplicates(list3);
//        System.out.println(res2);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = merge(list1.next, list2);
                return list1;
            } else {
                list2.next = merge(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null){
            return list2;
        }

        return list1;
    }

    private static ListNode removeDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        boolean res = head.val == head.next.val;
        if (res) {
            head.next = head.next.next;
            removeDuplicates(head);
        }
        else {
            removeDuplicates(head.next);
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
