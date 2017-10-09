class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==0) return 0;
        int min = nums[0];
        for(int n:nums) min = Math.min(min, n);
        int result = 0;
        for(int n:nums) result += (n-min);
        return result;
    }
}
