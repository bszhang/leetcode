class Solution {
    public boolean isPowerOfThree(int n) {
       int count=0; 
       while(Math.pow(3,count)!=n && Math.pow(3,count)<n){count++;}
       if (n==Math.pow(3,count)) return true;
       else return false;
    }
}
