# hashset.contains
# k-i!=i

class Solution{
    public boolean findTarget(TreeNode root, int k){
    	ArrayList<Integer> result = new ArrayList<Integer>();
        result = inorderTraversal(root);
        for(int i:result){
            System.out.println(i);
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i: result){
            set.add(i);
        }
        for(int i:result){
            if (set.contains(k-i) && (k-i!=i)){
                return true;
            }
        
        }
        return false;
    }
    
    
 
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root !=null){
            helper(root, result);
        }

        return result;
    }
 
    public void helper(TreeNode p, ArrayList<Integer> result){
        if(p.left!=null)
            helper(p.left, result);
 
        result.add(p.val);
 
        if(p.right!=null)
            helper(p.right, result);
    }
    
    
}
