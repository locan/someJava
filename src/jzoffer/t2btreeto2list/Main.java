package jzoffer.t2btreeto2list;

/**
 * Created by locan on 17/6/1.
 */
public class Main {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return pRootOfTree;
        TreeNode rRoot = pRootOfTree.right;
        TreeNode lRoot = pRootOfTree.left;
        TreeNode rIndex = pRootOfTree;
        TreeNode lIndex = pRootOfTree;
       while(rRoot!=null){
           rIndex.right = findMin(rRoot,null);
            if(rIndex.right==rRoot){
                rRoot = rRoot.right;
            }
           TreeNode temp = rIndex;
            rIndex.right.left = rIndex;
           rIndex = rIndex.right;
           //rIndex.left = temp;
       }
       while(lRoot!=null){
           lIndex.left = finMax(lRoot,null);
           if(lIndex.left == lRoot){
               lRoot = lRoot.left;
           }
           TreeNode temp = lIndex;

           lIndex = lIndex.left;
           lIndex.right = temp;
       }

        return lIndex;
    }

    public TreeNode findMin(TreeNode p,TreeNode parent){
        if(p==null){
            return null;
        }
        if(p.left==null){
            if(parent!=null)
                parent.left = null;

                TreeNode v = p;

                p = p.right;
                return v;

        }else{
            return findMin(p.left,p);
        }
    }


    public TreeNode finMax(TreeNode p,TreeNode parent){
        if(p==null)
            return null;
        if(p.right==null){
            if(parent!=null)
                parent.right =null;
                TreeNode v = p;
                p = p.left;
            return v;
        }

        else{
            return finMax(p.right,p);
        }
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(14);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(8);
        TreeNode n6 = new TreeNode(12);
        TreeNode n7 = new TreeNode(16);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        Main main = new Main();
        TreeNode node = main.Convert(n1);
        System.out.println(node);
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