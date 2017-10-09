class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n==0) return false;
        int curBit = 1 & n;
        while((n=n>>1)!=0){
                int newBit = 1 & n;
		int xorValue = curBit ^ newBit;
                if (xorValue == 0) return false;
		curBit = newBit;
	}
        return true;
    }
}
