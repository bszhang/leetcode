class Solution { 
    //No two characters may map to the same character but a character may map to itself.
    public boolean isIsomorphic(String s, String t) {
        if (s==null || t==null) return false;
        if (s.length()==0 && t.length()==0) return true;
        if (s.length()==0 || t.length()==0) return false;
        if (s.length()!=t.length()) return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> mapped = new HashSet<Character>();
        int len = s.length();
        for(int i=0;i<len;i++){
		    if (map.containsKey(new Character(s.charAt(i)))){
			    if ((map.get(new Character(s.charAt(i))).charValue())==t.charAt(i)){
				continue;
				}	
			    else {
				return false;
			    }
		    }
            else 
            {
			    map.put(new Character(s.charAt(i)),new Character(t.charAt(i)));
			    if (mapped.contains(new Character(t.charAt(i)))){return false;}
			    else mapped.add(new Character(t.charAt(i)));
            }	
	    }
	return true;
    }
}
