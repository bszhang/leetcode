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
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return 0;
        preorder(root);
	return sum;
    }
    
    public int preorder(TreeNode node){
    	        if (node == null) return 0;
		if (node.left!=null){
                   if (node.left.left==null && node.left.right==null){
		   sum += preorder(node.left);}
                   else{preorder(node.left);}
		}
		if (node.right!=null){
		  preorder(node.right);
		}
		return node.val;
    }
}
