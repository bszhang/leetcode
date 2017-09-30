class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		if (nums.length==0 || nums==null){return result;}
		int[] t = new int[nums.length+1];
		for(int i:nums){
			t[i] = 1;
		}
		for(int i=1;i<=nums.length;i++){
			if (t[i]==0){result.add(i);}
		}
		return result;

	}
}
