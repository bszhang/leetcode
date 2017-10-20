class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==0 || nums==null) return 0;
        int count=1;
        int maxCount=1;
        int pre = nums[0];
        for(int i=1;i<nums.length;i++){
            
	        if (nums[i]>pre){count++;pre = nums[i];maxCount=Math.max(count, maxCount);}
            else{maxCount=Math.max(count, maxCount); pre = nums[i]; count=1;}
	}
        return maxCount;
    }
}
