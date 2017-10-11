# Time Limit Exceeded

class Solution {
    public int countDigitOne(int n) {
     int sum = 0;  
     for(int i=1;i<=n;i++){      
         sum += count(i);
	}
     return sum;
    }
    public int count(int n){
        int sum = 0;
        while(n!=0){
        int left= n%10;
        if (left==1) sum++;
        n = (int)n/10;}
        return sum;
    }
}
