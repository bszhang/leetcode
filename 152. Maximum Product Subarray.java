class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length==0 || nums==null ) return 0;
        int res=1;
 	ArrayList<Integer> idx = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){if (nums[i]<0) idx.add(i);}
        if (idx.size()%2==0){
           for(int i:nums){
	       res *=i;	
	   }
           return res;
        }
       else{
	  for(int i=0;i<idx.size();i+=2){
                int prod1=1;
                int prod2=1;
		int cur_idx = idx.get(i);
               
                for(int j=0;j<cur_idx;j++){
			prod1 *=j;	
		}
                
                 for(int j=cur_idx+1;j<nums.length;j++){
			prod2 *=j;	
		}
                res = Math.max(prod1, prod2);
	  }	
         return res;	
	}
    }
}
