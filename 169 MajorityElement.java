import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[(int)len/2];
    }
}
