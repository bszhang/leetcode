import java.util.ArrayList;


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null){return null;}
        if( nums1.length==0 || nums2.length==0){return new int[0];}
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i:nums1){
	        if (map1.containsKey(i)){map1.put(i, map1.get(i)+1);}	
 	        else{map1.put(i,1);}
	    }
        for(int i:nums2){
	        if (map2.containsKey(i)){map2.put(i, map2.get(i)+1);}	
 	        else{map2.put(i,1);}
	    }
        for(int i:nums1){
		    if (map1.get(i)>0 && map2.containsKey(i)&& map2.get(i)>0){
                res.add(i);
                map1.put(i, map1.get(i)-1); 
                map2.put(i, map2.get(i)-1);
            }
	    }
       int[] result = new int[res.size()];
       for(int i=0;i<res.size();i++){result[i]=res.get(i);}
        
       return result;
    }
}
