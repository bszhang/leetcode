class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }
    
    private List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>>map){
	    if(map.containsKey(s)){
		    return map.get(s);
	    }
	    LinkedList<String> res = new LinkedList<String>();
	    if(s.length()==0){	
		    res.add("");
		    return res;
	    }
	    for(String word: wordDict){
		    if(s.startsWith(word)){
			    List<String> sublist = DFS(s.substring(word.length()),wordDict,map);
			    for(String sub:sublist){
				    res.add(word +((sub.length()==0)?"":" ")+sub);	
			    }	
		    }	
	    }
	    map.put(s,res);
	    return res;
    }
}
