class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0 || nums1==null || nums2==null) {return new int[]{};}
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int n:nums1){
            set1.add(new Integer(n));
        }
        for(int n:nums2){
  	    set2.add(new Integer(n));      
  	}
        set1.retainAll(set2);
        Integer[] array = set1.toArray(new Integer[set1.size()]);
        int[] result = new int[array.length];
        for(int i=0;i<array.length;i++){
           result[i] = array[i].intValue();
        }
        return result;
    }
}
