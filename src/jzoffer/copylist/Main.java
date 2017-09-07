package jzoffer.copylist;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by locan on 17/6/1.
 */
public class Main {

    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null)
            return null;

        RandomListNode newHead = null;
        RandomListNode newNode = null;
        RandomListNode node = pHead;
        RandomListNode last = null;
        List<RandomListNode> list = new ArrayList<>();
        boolean isHead = true;
        Map<RandomListNode,Integer> map = new HashMap<>();
        while(node!=null){
            if(isHead){
                newHead = newNode = new RandomListNode(node.label);
                last = newNode;
                isHead = false;
            }else{
                newNode = new RandomListNode(node.label);
                last.next = newNode;
                last = newNode;
            }
            RandomListNode temp = pHead;

            if(node.random==null){
                map.put(newNode,null);
            }else{
                int i=0;
                while(temp!=node.random){
                    temp = temp.next;
                    i++;
                }
                map.put(newNode,i);
            }
            list.add(newNode);

            node = node.next;
        }


        newNode = newHead;
        while(newNode!=null){
            if(map.get(newNode)!=null)
                newNode.random = list.get(map.get(newNode));
            newNode = newNode.next;
        }
    return newHead;
    }





    public static void main(String[] args) {
        RandomListNode n1 = new RandomListNode(1);
        RandomListNode n2 = new RandomListNode(2);
        RandomListNode n3 = new RandomListNode(3);
        RandomListNode n4 = new RandomListNode(4);
        RandomListNode n5 = new RandomListNode(5);
        n1.next = n2;
        n2.next =n3;
        n3.next = n4;
        n4.next =n5;

        n1.random = n3;
        n2.random = n5;
        n4.random = n2;
        Main main = new Main();
        main.Clone(n1);


    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}