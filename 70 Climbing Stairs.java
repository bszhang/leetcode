class Solution {
    public int climbStairs(int n) {
        int[] result = new int[n];
        result[0]=1;
        if(n>=2){result[1]=2;}
        for(int i=2;i<n;i++){
		result[i]=result[i-1] + result[i-2];
	}
        return result[n-1];  
    }

 public int climbStairs(int n, int stepM) {
        int stepCount=0;
        if (n==0) return 1;
        if(n>=m){
	  for(int i=0;i<=m;i++){
			stepCount+=climbStairs(n-i,m);	
		}	
	}
        else{
		stepCount += climbStairs(n,n);	
	}
       
        return stepsCount;  
    }
}
