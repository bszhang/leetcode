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
    public String tree2str(TreeNode t) {
        if ( t==null ) return "";
        String result = "";
        result = result + Integer.toString(t.val);
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        if(right.length()!=0){
             result += "(";
             result += left;
             result += ")";
             result += "(";
             result += right;
             result += ")";
        }
        else if(left.length()!=0){
             result += "(";
             result += left;
             result += ")";
        }
    return result;
}
}
