class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest)
    {
         int pigs = 0;
         int interval = minutesToTest/minutesToDie;
         while (Math.pow(interval+1, pigs) < buckets){pigs++;}
    	 return pigs;
    
    }
}
