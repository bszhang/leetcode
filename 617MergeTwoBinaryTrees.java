/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (( t1 == null ) && ( t2 == null )){ return null;}
        if ( t1 == null) { return t2; }
        if ( t2 == null) { return t1; }
        int new_root_val = t1.val + t2.val;
        TreeNode new_root = new TreeNode(new_root_val);
        TreeNode leftSon = mergeTrees(t1.left, t2.left);
        TreeNode rightSon = mergeTrees(t1.right, t2.right);
        new_root.val = new_root_val;
        new_root.left = leftSon;
        new_root.right = rightSon;
        return new_root;
    }
}
