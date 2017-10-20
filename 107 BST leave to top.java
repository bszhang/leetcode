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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null) return new ArrayList<List<Integer>>();
        ArrayList<Integer> curArray = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(root);
        int lev=1;
        while(!q.isEmpty()){
	    int currentSize=q.size();
       
            curArray = new ArrayList<Integer>();
            for(int i=0;i<currentSize;i++ ){
			TreeNode tr = q.poll();
                        curArray.add(tr.val);
                        if (tr.left!=null){q.add(tr.left);}
                        if (tr.right!=null){q.add(tr.right);}
	    }
            map.put(lev,curArray);
      
            lev++;
        }
        
        for(int j=lev-1;j>=1;j--){
                res.add(map.get(j));
	}
        return res;
    }
}
