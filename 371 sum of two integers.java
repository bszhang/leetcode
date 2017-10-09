class Solution {
    public int getSum(int a, int b) {
        if(b==0) return a;
        while(b!=0){
           int carrier = a&b;
           a = a ^ b;
           b = carrier <<1;
        }
        return a;
    }
}
