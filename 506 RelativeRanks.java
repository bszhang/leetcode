class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if (nums.length==0 || nums==null) return null;
	    int[] copy = (int[])nums.clone();
        Integer[] sort = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            sort[i]=nums[i];
        }
        Arrays.sort(sort, Collections.reverseOrder());
        String[] res = new String[nums.length];
        for(int i=0;i<copy.length;i++){
	        int indx = Arrays.asList(sort).indexOf(new Integer(copy[i]));
            if (indx ==0){res[i]="Gold Medal";}
            else if (indx ==1){res[i]="Silver Medal";}
            else if (indx ==2){res[i]="Bronze Medal";}
            else { res[i]=Integer.toString(indx+1);}
	    }
        return res;
    }

}
