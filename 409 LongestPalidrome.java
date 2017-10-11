class Solution {
    public int longestPalindrome(String s) {
           if (s.length()==0 || s==null){
	       return 0;
	   } 
	   HashMap<Character, Integer> count = new HashMap<Character, Integer>();
           for(int i=0;i<s.length();i++){
		Character c = s.charAt(i);
                if(count.containsKey(c)){count.put(c,count.get(c)+1);}
                else{count.put(c,1);}
	   }
           List<Character> l = new ArrayList<Character>(count.keySet());
          
           int sum=0;
           boolean findSingle=false;
           for(int i=0;i<l.size();i++){
                int curCount = count.get(l.get(i)).intValue();
                if (curCount%2==0){sum+= curCount;}
                else{
                   if (findSingle){sum+= curCount-1;}
                   else{
                        findSingle=true;
                        sum+=curCount;  
                   }
                }
	   }
          return sum;
       
    }
}
