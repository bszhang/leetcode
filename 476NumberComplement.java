class Solution {
    public int findComplement(int num) {
     boolean start = false;
     for( int i = 31; i >= 0; i-- ){
       if ((num & (1 << i))!=0) { start = true; }
       if (start) { num ^= (1<<i); }
     }
     return num;
    }
}


class Solution {
    public int findComplement(int num) {
     int ones = (Integer.highestOneBit(num) << 1) - 1;
    return num ^ ones;
    }
}


