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
        int min = Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        int count=0;
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null) return -1;
        count++;
        if (root.val < min){secMin = min; min = root.val; }
        else if(roo.val < secMin){secMin = root.val;}
       
    }
	    
}
