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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null || nums.length==0 ) return null;
        if (nums.length==1) { return new TreeNode(nums[0]);}
        if (nums.length==2){
                TreeNode res = new TreeNode(nums[1]);
                res.left = new TreeNode(nums[0]);
                return res;
        }
        int middle_idx = (int)(nums.length/2);
        int[] left = new int[middle_idx];
        int[] right = new int[nums.length-1-middle_idx];
        for(int i=0;i<middle_idx;i++){left[i]=nums[i];}
        for(int i=0;i<nums.length-1-middle_idx;i++){right[i]=nums[i+middle_idx+1];}
        TreeNode res = new TreeNode(nums[middle_idx]);
        res.left = sortedArrayToBST(left);
        res.right= sortedArrayToBST(right);
        return res;
       
    }
}
