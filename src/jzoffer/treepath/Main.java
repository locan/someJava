package jzoffer.treepath;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by locan on 17/6/1.
 */
public class Main {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)
            return new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        trealTree(root,0,target,list,result);
        return result;
    }



    public void trealTree(TreeNode node,Integer sum,Integer target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        sum+=node.val;
        if(sum>target){
            sum-=node.val;
            return;
        }
        list.add(node.val);
        if(node .left==null&&node.right==null){
            if(sum==target){
                ArrayList<Integer> newList = new ArrayList<>(list);
                result.add(newList);
            }
        }else {
            if(node.left!=null){
                trealTree(node.left,sum,target,list,result);
            }
            if(node.right!=null){
                trealTree(node.right,sum,target,list,result);
            }
        }
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(12);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;


        Main main = new Main();

        ArrayList<ArrayList<Integer>> list = main.FindPath(n1,22);


    }

}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}