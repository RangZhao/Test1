package hao;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    /**
     * 逆序链表
     * @param head ListNode类 头结点
     * @return ListNode类
     */
    public ListNode reverseList (ListNode head) {
        if (head==null)return null;
        if (head.next==null)return head;
        ListNode p=head;
        ListNode c=head.next;
        p.next=null;
        while (c!=null){
            ListNode next = c.next;
            c.next=p;
            p=c;
            c=next;
        }
        return p;
    }
}