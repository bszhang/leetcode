import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        if (root == null ){return result;}
        Queue <TreeNode> treeQueue = new LinkedList<TreeNode>();
        Queue <TreeNode> treeQueueNextLevel = new LinkedList<TreeNode>();
        int level =0;
        treeQueue.add(root);
        while(treeQueue.size()!=0){
        double sum = 0;
        int size = treeQueue.size();
        while(treeQueue.size()!=0){
        	 TreeNode current = treeQueue.remove();
        	 sum = sum + current.val;
        	 if (current.left!=null) {treeQueueNextLevel.add(current.left);}
        	 if (current.right!=null) {treeQueueNextLevel.add(current.right);}
        }
        result.add(sum/size);
        level ++;
        treeQueue = treeQueueNextLevel;
        treeQueueNextLevel = new LinkedList<TreeNode>();
       }
        return result;
    }
}