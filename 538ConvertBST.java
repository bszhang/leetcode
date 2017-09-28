class Solution {
    public int sum = 0;
    // tranverse right, middle, left;
    public TreeNode convertBST(TreeNode root) {
    	if (root==null) return null;
    	if(root.right!=null){
           root.right = convertBST(root.right);	
	}
        int org = root.val;
    	root.val += sum;
   	    sum += org;
    	if(root.left!=null){
  		root.left = convertBST(root.left);	
   	}
    	return root;
    }

}
