class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}

class Solution {
    public String convertToBase7(int num) {
        int org = num;
        String res="";
        num = Math.abs(num);
        int left;
        while(num>=7){
        	left = (num % 7);
       		res = Integer.toString(left)+res;
        	num -= left;
        	num /=7;
        }
       res = Integer.toString(num)+res;
       if (org<0) res = "-"+res;
       return res;
    }
}
