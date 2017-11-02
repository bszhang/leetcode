class Solution {
    //Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
    // s is mother, p is son.  p's anagrams are p's simblings.
    	public List<Integer> findAnagrams(String s, String p) {
        	List<Integer> idx = new ArrayList<Integer>();
        	if(p==null || p.length()==0 || s==null || s.length()==0) return idx;
		if(p.length()>s.length())return idx;
        	HashMap<Character, Integer> mapP = getCharMap(p);
        	for(int i=0;i<=s.length()-p.length();i++){
	    		String ss = s.substring(i,i+p.length());
			HashMap<Character, Integer> tmpMap = getCharMap(ss);
			if (hashMapEqual(tmpMap,mapP)){idx.add(i);}
		}
		return idx;
    	}


	private HashMap<Character, Integer> getCharMap(String p){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        	for(char c:p.toCharArray()){
			map.put(c,map.getOrDefault(c,0)+1);	
		}	
		return map;
	}
	
	private boolean hashMapEqual(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
	    if(map1.keySet().size()!=map2.keySet().size()) return false;
	    for(Character c:map1.keySet()){
		if (map1.get(c)!=map2.get(c)) return false;	
		}
	    return true;	
	}
}

class Solution {
    //Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
    // s is mother, p is son.  p's anagrams are p's simblings.
    	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> idx = new ArrayList<Integer>();
        	if(p==null || p.length()==0 || s==null || s.length()==0) return idx;
		if(p.length()>s.length())return idx;
        	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        	for(char c:p.toCharArray()){
			map.put(c, map.getOrDefault(c,0)+1);
		}
	   	// number of different keys
	 	int counter = map.size();
		int begin =0, end = 0;
		while(end < s.length()){
		  	char c = s.charAt(end);
			if(map.containsKey(c)){
				map.put(c, map.get(c)-1);
				if(map.get(c)==0) counter--;	
			}
			end++;	
			while(counter==0){
				char tempc = s.charAt(begin);
				if(map.containsKey(tempc)){	
					map.put(tempc, map.get(tempc)+1);
					if(map.get(tempc)>0) counter++;
				}	
				if (end-begin==p.length()){
					idx.add(begin);					
				}
				begin++;	
			}
		
		}
		return idx;
	}
}
