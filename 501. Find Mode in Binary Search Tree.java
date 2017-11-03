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

    HashMap<Integer, Integer> map = new HashMap<>();	
    public int[] findMode(TreeNode root) {
        traverseBST(root);
	List<Integer> res = new ArrayList<Integer>();
	int max=0;
	for(int i:map.keySet()){
	    if (max < map.get(i)){max = map.get(i);}
	}
	for(int i:map.keySet()){
	    if (map.get(i)==max){res.add(i);}	
	}
        int [] result = new int[res.size()];	
	for(int i=0;i<res.size();i++){
		result[i]=res.get(i);	
	}
	return result;
    }
	
    private void traverseBST(TreeNode node){
	if (node==null) return;
	map.put(node.val, map.getOrDefault(node.val,0)+1);
	traverseBST(node.left);
	traverseBST(node.right);
    }	
}
