class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        if (s.length() ==0 || s ==null) {return t.charAt(0);}
        for(int i=0;i<s.length();i++){
        	char a = s.charAt(i);
        	Character key = new Character(a);
        	 if (result.containsKey(key)){
        	 	result.put(key, result.get(key)+1);
        	 }
        	 else
        	 {
        	 	result.put(key, 1);
        	 }
        }
        for(int i=0;i<t.length();i++){
        	char a = t.charAt(i);
        	Character key = new Character(a);
            System.out.println("char now is " + a);
        	if (result.containsKey(key) && result.get(key)>=1){
        	 	result.put(key, result.get(key)-1);
        	 }
        	else {return a;}
        }
        return '0';
    }
}