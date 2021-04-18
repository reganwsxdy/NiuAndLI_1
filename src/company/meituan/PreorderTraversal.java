package company.meituan;

import java.util.ArrayList;
import java.util.List;
/**
 * 前、中、后序遍历模板
 *
 * 一句回忆：输出是list，写一个遍历函数，内容是通过递归将每次访问的节点值放入list中
 * */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res){
        if (root == null) return;
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
