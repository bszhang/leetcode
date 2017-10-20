class Solution {
    public boolean isPowerOfFour(int n) {
        int count=0; 
       while(Math.pow(4,count)!=n && Math.pow(4,count)<n){count++;}
       if (n==Math.pow(4,count)) return true;
       else return false;
    }
}
