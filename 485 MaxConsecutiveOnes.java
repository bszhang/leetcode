class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    if (nums == null || nums.length==0){return 0;}
    int sum = 0;
    int localsum=0;
    for(int i:nums){
     if (i==1){
      localsum++;
      if (localsum > sum){
        sum = localsum;}
        
        continue;
      }
      if(i==0){
       localsum=0;
     }
   }
   return sum;
 }
}