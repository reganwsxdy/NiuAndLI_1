package com.java.Tree;

/**
 * 题目是合并二叉树，实际上并不复杂，就是新创建一个二叉树节点，然后用递归的方式逐个将合并后的值传入，然后思考如果遇到null怎么办
 *
 *
 * 深度优先遍历，采用递归的思路，遍历过程中的三种情况，
 * 1 两个对应节点均不为空，则创造一个新节点且对应val值为val1+val2
 * 2 两个对应节点其中一个为空，则返回另一个现有节点即可，因为剩余部分即为其剩余子树
 * 3 两个对应节点均为空，合并后的对应节点为空
 */

public class merge_TwoTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null){
            return root2;
        }
        if (root2 == null){
            return root1;
        }//如果二者均为空，返回的是谁无所谓，均为null，也就是说这两个if函数顺序可以调换
        //以下为两者均不为空的情况
        TreeNode merge = new TreeNode(root1.val + root2.val);
        merge.left = mergeTrees(root1.left,root2.left);
        merge.right = mergeTrees(root1.right,root2.right);
        //如果两者均不为空，则返回的merge也不为空，返回的是一个val!=null的merge
        return merge;

    }
}
