package com.java.io.mergeTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * 采用递归的方式更加简单
 */
public class Solution {

    /**
     * 不能更改结构
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        ListNode() {

        }

        boolean hasNext() {
            return null != next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode result = new ListNode();
        System.out.println("l1" + l1.val + ", l2" + l2.val);
        while (l1.hasNext() && l2.hasNext()) {
            System.out.println("start");
            result.val = l1.val;
            result.next = new ListNode(l2.val);
            l1 = l1.next;
            l2 = l2.next;
            if (l1.hasNext() && l2.hasNext()) {
                nodeList.add(result);
                result = result.next;
            } else {
                break;
            }
        }
        return nodeList.get(0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(7);
        ListNode result = solution.mergeTwoLists(l1, l2);
        System.out.println("val:" + result.val + ",next:" + result.next.val);
    }
}
