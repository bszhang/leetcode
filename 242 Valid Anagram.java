class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> res1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> res2 = new HashMap<Character, Integer>(); 
        res1 = getCount(s);
        res2 = getCount(t);
	if (res1==null && res2==null) return true;
        if (res1==null || res2==null) return false;
        if (s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
	    Character c = new Character(s.charAt(i));
             if(!res2.containsKey(c)){return false;}
 	         if(res1.get(c).intValue()!=res2.get(c).intValue()){
	        return false;		
	    }
	}
	return true;
    }

    public HashMap<Character, Integer> getCount(String s){
        if (s==null || s.length()==0){
            return null; 
        }
        HashMap<Character, Integer> res = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
 		Character c = new Character(s.charAt(i));
		if (res.containsKey(c)){
		   res.put(c, res.get(c)+1);		
		} 	
		else{
		   res.put(c,1);		
		}
	}
	return res;
    }
}
