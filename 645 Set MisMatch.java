class Solution {
    public int[] findErrorNums(int[] nums) {
        if (nums==null || nums.length==0) return new int[0];
       int [] counts = new int[nums.length+1];
       for(int i:nums){
	      counts[i]++;	
	   }
       int[] result = new int[2];
       for(int i=1;i<nums.length+1;i++){
	        if (counts[i]==2) result[0]=i;
            if (counts[i]==0) result[1]=i;	
	   }
      return result;
    }
}
