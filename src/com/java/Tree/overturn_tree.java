package com.java.Tree;

public class overturn_tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        //以上是特殊情况下的出口
        //因为不是传递值而是传递对象，因此不需要中间变量，直接new一个对象即可
        //新创建的对象用于接收两个子root根节点翻转之后的树,相当于交换数字的中间变量
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;//常规情况下的出口
    }
}
