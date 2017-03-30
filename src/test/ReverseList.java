package test;

import common.ListNode;

/**
 * Created by luan on 2017/3/18.
 */
public class ReverseList {

    public void nextNode(ListNode node,ListNode next){
       if(next.next==null){
           next.next = node;
       }else{
           nextNode(node.next,node.next.next);
           next.next = node;

       }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        ListNode node = new ListNode(0);
        ListNode first = node;
        ListNode next = null;
        for(int i=0;i<a.length;i++){
            next = new ListNode(a[i]);
            first.next = next;
            first = next;
        }
        ReverseList reverseList = new ReverseList();
        reverseList.nextNode(node,node.next);
        node.next = null;
        while(node!=null){
            System.out.println(node.val+ "");
            node = node.next;
        }

    }
}
