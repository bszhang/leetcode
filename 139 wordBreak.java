class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s==null || s.length()==0 || wordDict.size()==0 || wordDict==null) return false;
        int len = s.length();
        int[] flag = new int[len];
	int count=0;
        ArrayList<Integer> checkPoint = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
			String sub = s.substring(0,i+1);
                	if (wordDict.contains(sub)){
 				flag[i]=1;
				continue;
  			}
			for(int j=0;j<i;j++){
               			if (flag[j]==1){
					String subSub = s.substring(j+1,i+1);
 					if(wordDict.contains(subSub)){
						flag[i]=1;	
					}	
				}
			}
	}
	return flag[len-1]==1;
    }
}
