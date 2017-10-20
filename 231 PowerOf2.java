class Solution {
    public boolean isPowerOfTwo(int n) {
          int count=0; 
       while(Math.pow(2,count)!=n && Math.pow(2,count)<n){count++;}
       if (n==Math.pow(2,count)) return true;
       else return false;
    }
}
