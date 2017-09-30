class Solution {
    public boolean detectCapitalUse(String word) {
        if (word ==null || word.length()==0){return true;}
        // find before?
        boolean findCapital=false;
        boolean findLower = false;
        int numCap = 0;
        for(int i=0;i<word.length();i++){
        	char a = word.charAt(i);
            if (Character.toUpperCase(a)==a){
                numCap ++;
                if (findLower){return false;}
            	// if meet first time:
            	if (findCapital == false){
            		findCapital = true;
                    if (i!=0){
                    	return false;
                    }
            	}
            }else
            {
                findLower = true;
                if (numCap>1){return false;}
            }
        }
        return true;
    }
}