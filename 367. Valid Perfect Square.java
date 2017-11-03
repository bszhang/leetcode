class Solution {
    public boolean isPerfectSquare(int num) {
        int n=1;
	int max = Integer.MAX_VALUE:
   	while(n*n<=max && n*n!=num){n++;}
	if n*n==num return true;
 	else return false;
    }


public boolean isPerfectSquare(int num) {
     int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0;
 }


}


