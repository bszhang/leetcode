class Solution {
    public int firstUniqChar(String s) {
        if (s.length()==0 || s==null) return -1;
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            Character c = new Character(s.charAt(i));
            if (count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }else{
                count.put(c,1);
            }
        }
        for(int j=0;j<s.length();j++){
            Character c = new Character(s.charAt(j));
            if (count.get(c)==1){
                return j;
            }
        }
        return -1;
    }
}
