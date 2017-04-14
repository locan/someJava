package jzoffer.t2;

/**
 * Created by locan on 17/4/11.
 */


   class TreeNode {
      int val;
      TreeNode left;
   TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int len = pre.length;
        TreeNode root = constructCore(pre,0,len-1,in,0,len-1);
        return root;
    }


    public TreeNode constructCore(int[] pre,int begin,int end,int[] in ,int begin2,int end2){
        int beginVal = pre[begin];

        TreeNode root = new TreeNode(beginVal);
        root.left = null;
        root.right = null;
        for(int i=begin2;i<=end2;i++){
            int step = i-begin2;
            if(in[i]==beginVal&&begin2!=end2){

                //左子树
                if(i==begin2){
                    root.left = null;
                }else{

                    root.left = constructCore(pre,begin+1,begin+step,in,begin2,i-1);
                }
                //右子数

                if(i==end2){
                    root.right = null;
                }else{
                    root.right = constructCore(pre,begin+step+1,end,in,i+1,end2);
                }


            }if(in[i]==beginVal&&begin2==end2){

            }
        }
        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode n1 =  s.reConstructBinaryTree(new int[]{1,2,3,4},new int[]{4,3,2,1});
        System.out.println(1);
    }
}