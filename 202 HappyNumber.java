class Solution {
    public boolean isHappy(int n) {
         int slow=n;
         int fast=n;
         
    do {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(fast);
        fast = digitSquareSum(fast);
    } while(slow != fast);
        System.out.println("slow is "+slow);
    if (slow == 1) return true;
    else return false;        

    }
    public int digitSquareSum(int n){
 	    int sum=0;
        int tmp=0;
        while(n!=0){
	      tmp = n % 10;
          sum += tmp*tmp;
          n = n/10;
	}	
         return sum;
	}
}
