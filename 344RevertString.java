class Solution {
    public String reverseString(String s) {
        if(s==null || s.length()==0) {return s;}
       return new StringBuilder(s).reverse().toString();
    }
}
