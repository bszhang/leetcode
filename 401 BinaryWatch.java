class Solution {
     Set<String> res = new HashSet<String>();
     public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        if (num<0 || num>10) return result;
        if (num==0){result.add("0:00"); return result;}
        // upper has i 1s
        int upLimit = Math.min(num,4);
     
        for(int i=0;i<=upLimit;i++){
             StringBuilder sbUpper = new StringBuilder();
        StringBuilder sbLower = new StringBuilder();
           int count =0;
           while(count<i){sbUpper.append("1");count++;}
           count=0;
           while(count<4-i){sbUpper.append("0");count++;}
           count=0;	
           while(count<num-i){sbLower.append("1");count++;}
           count=0;
           while(count<(6-(num-i))){sbLower.append("0");count++;}
           count=0;
	   String valU = sbUpper.toString();
           String valL = sbLower.toString();     
           res = new HashSet<String>();
           perm1(valU);
           Set<String> Ulist = new HashSet<String>(res);
           res = new HashSet<String>();
           perm1(valL);
           Set<String> Llist = new HashSet<String>(res);
           for(String u:Ulist){
  		for(String l:Llist){
                 	 int U = Integer.parseUnsignedInt(u, 2);
           		 int L = Integer.parseUnsignedInt(l, 2);
                      
                         if(U>11 || L>59) continue;
           		 if (L<10) {result.add(Integer.toString(U)+":"+"0"+Integer.toString(L));}
           		 else {result.add(Integer.toString(U)+":"+Integer.toString(L));}		
		}
           }
          
       }
       return result;
        
    }
    public  void perm1(String s){
       perm1("",s);
    }
    private void perm1(String prefix, String s){
        int n = s.length();
   	if (n==0) {res.add(prefix);}
     	else{
        for(int i=0;i<n;i++){
		perm1(prefix+s.charAt(i), s.substring(0,i)+s.substring(i+1,n));
	}
     }
   }
 

   
}
