class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums2==null || nums2.length==0) {return new int[]{};}
         int[] result = new int[ nums1.length];
         for(int i=0;i<nums1.length;i++){
             result[i]=-1;
             int key = nums1[i];
             boolean found = false;
             for(int j=0;j<nums2.length;j++){
                 if (nums2[j] == key){
                    found = true;
                 }
                 if (nums2[j]>key && found){
                    result[i] = nums2[j];
                    break;
                 }
             }
         }
         return result;
    }
}