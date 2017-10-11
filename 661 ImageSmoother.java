class Solution {
    public int[][] imageSmoother(int[][] M) {
        if (M.length==0 || M==null) return M;
        int rLength=M.length;
        int cLength=M[0].length;
        int[][] org = new int[rLength][cLength];
        for(int i=0;i<rLength;i++){
       	  for(int j=0;j<cLength;j++){
            org[i][j]=M[i][j];
 	  }
        }
        for(int i=0;i<rLength;i++){
    	  for(int j=0;j<cLength;j++){
	    int sum = 0;
            int count=0;
            if(i>=1){
                sum += org[i-1][j];
                count++;
                
            }
            if(i<rLength-1){
		sum += org[i+1][j];
                count++;
	    }
            if(j>=1){
 		sum += org[i][j-1];
		count++;
  	    }
	    if(j<cLength-1){
	    	sum += org[i][j+1];
		count++;
   	    }
            if(i>=1 && j>=1){
	        sum += org[i-1][j-1];
		count++;
	    }
            if(i>=1 && j<cLength-1){
                sum += org[i-1][j+1];
		count++;
            }
 	    if(i<rLength-1 && j>=1){
	        sum += org[i+1][j-1];
		count++;
	    }
            if(i<rLength-1 && j<cLength-1){
                sum += org[i+1][j+1];
		count++;
            }
	    M[i][j]=(int)(sum+org[i][j])/(count+1);
  	  }	
	}
       return M;
    }
}
