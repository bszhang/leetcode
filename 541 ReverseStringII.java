class Solution {
    public String reverseStr(String s, int k) {
        if (s==null || s.length()==0) return s;
        if (k<=0) return s;
       
        StringBuilder sb = new StringBuilder();
        int count =0;
        boolean reverseFlag = true;
        while((count+k)<=s.length()){
            boolean flagIn;
            String str = s.substring(count, count+k);
	        if (reverseFlag){
                        sb.append(reverseString(str));	   
                System.out.println(str);
                        
		}
            else{
			sb.append(str);	
            
	        }
            reverseFlag = !reverseFlag;
            count+=k;
	}
        if (count==s.length()){return sb.toString();}
        if (!reverseFlag){sb.append(s.substring(count,s.length()));}
        else{sb.append(reverseString(s.substring(count, s.length())));}
        return sb.toString();
        
    }
    public String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
