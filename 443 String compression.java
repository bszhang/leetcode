class Solution {
    public int compress(char[] chars) {
        if (chars==null || chars.length==0) return 0;
	    
        int[] count = new int[26];
	    for(char c:chars){
		   count[c-'a']++;
	    }
	    int res = 0;
        for(int i=0;i<26;i++){
            if (count[i]==0){continue;}    
            if (count[i]==1){res++;}
            else{res = res + 1 + getBit(count[i]); }
        }
        return res;
    }
    
    private int getBit(int t){ 
		int count =1;	
		while(t/10!=0){count++;t/=10;}
		return count;	
	}
	

}
