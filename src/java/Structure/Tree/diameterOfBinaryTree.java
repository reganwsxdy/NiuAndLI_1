package java.Structure.Tree;

/**
 * 题目：求一颗树两个结点之间的最长路径
 * Input:
 *
 *          1
 *         / \
 *        2  3
 *       / \
 *      4   5
 *
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * 思路：不必对所有结点之间的“路径”进行对比，只需要对比所有单个结点的左子树高度+右子树高度即可
 * 因此只需要在之前的高度计算递归中添加一个对比算法，每次对比一下和上一层递归计算的最大值，最后在主函数输出结果
 *
 * */

public class diameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root){
        Depth(root);
        return max;
    }
    public int Depth(TreeNode root){
        if (root == null) return 0;
        int leftDepth = Depth(root.left);
        int rightDepth = Depth(root.right);
        max = Math.max(max ,leftDepth+rightDepth);
        return Math.max(Depth(root.left),Depth(root.right))+1;
    }
}
