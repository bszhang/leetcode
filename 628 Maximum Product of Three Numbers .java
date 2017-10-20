class Solution {
   public int maximumProduct(int[] nums) {
       if (nums.length <= 2 || nums==null) return 0;
       int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,secMax=Integer.MIN_VALUE,secMin=Integer.MAX_VALUE,thirdMax=Integer.MIN_VALUE;
       
       for(int i=0;i<nums.length;i++){
		        if (nums[i]<min) {secMin=min; min=nums[i];}
                else if (nums[i]<secMin){secMin = nums[i];}
           
                if (nums[i]>max) {thirdMax=secMax; secMax=max; max=nums[i];}
                else if (nums[i]>secMax){thirdMax=secMax;secMax = nums[i];}
                else if (nums[i]>thirdMax){thirdMax= nums[i];}
           
       }
      
       
       int max1=min*secMin*max;
       int max2=thirdMax*secMax*max;
       return Math.max(max1,max2);
    }
   
}
