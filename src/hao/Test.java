package hao;

public class Test {
    ListNode r(ListNode root){
        if (root==null)return null;
        if (root.next==null)return root;
        ListNode p=null;
        ListNode c=root;
        synchronized (p){

        }
        while(c!=null){
            ListNode next = c.next;
            c.next=p;
            p=c;
            c=next;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);
        ListNode r = new Test().r(node);
        while (r!=null){
            System.out.println(r.val);
            r=r.next;
        }
    }
}
