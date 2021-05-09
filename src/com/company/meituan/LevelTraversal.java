package com.company.meituan;

import java.util.*;

public class LevelTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root!=null)queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i++){
                TreeNode node = queue.poll();
                if (res.size() % 2 == 0){tmp.addLast(node.val);}
                else {tmp.addFirst(node.val);}
                if (node.left != null) queue.add(node.left);
                if (node.right != null)queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right ){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
