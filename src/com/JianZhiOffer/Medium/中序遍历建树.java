package com.JianZhiOffer.Medium;

import java.util.HashMap;
import java.util.Map;
/**
 * 前序 中序序列，建树，返回树的root
 *
 * 1 hashmap便于快速寻找
 * 2
 * */
public class 中序遍历建树 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode Build(int[] preorder, int[] inorder){
        int n = preorder.length;
        for (int i = 0; i < n; i++){
            map.put(inorder[i],i);
        }
        return myBuild(preorder,inorder,0,n-1,0,n-1);
    }

    public TreeNode myBuild(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd){
        //树的递归返回一般都为null，因为叶子结点的左右子树均为null，以此作为递归出口
        if (preStart > preEnd) {
            return null;
        }
        int preRoot = preorder[preStart];
        TreeNode root = new TreeNode(preRoot);
        int inRoot = map.get(preRoot);
        int leftLength = inRoot - inStart;
        root.left = myBuild(preorder, inorder, preStart+1, preStart+leftLength, inRoot-leftLength, inRoot-1);
        root.right = myBuild(preorder, inorder, preStart+leftLength+1, preEnd, inRoot+1, inEnd);
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right ){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
