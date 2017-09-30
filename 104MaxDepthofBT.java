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
	public int maxDepth(TreeNode root) {
		if (root==null){return 0;}
		int leftMaxDepth = 0;
		int rightMaxDepth=0; 
		if (root.left!=null){
			leftMaxDepth = maxDepth(root.left);
		}
		if(root.right!=null){
			rightMaxDepth = maxDepth(root.right);
		}
		if (leftMaxDepth > rightMaxDepth){return leftMaxDepth + 1;}
		else {return rightMaxDepth + 1;}
	}
}

