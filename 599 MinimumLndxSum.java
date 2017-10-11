class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
 	if (list1==null || list1.length==0 || list2==null || list2.length==0) return null;     
        Set<String> set1= new HashSet<String>();
        Set<String> set2= new HashSet<String>();
        ArrayList<String> str = new ArrayList<String>();
    	for(String s:list1){
		set1.add(s);	
	}  
        for(String s:list2){
		set2.add(s);		
	}
        set1.retainAll(set2);
        int min=Integer.MAX_VALUE;

        for(int i=0;i<list1.length;i++){
            String s = list1[i];
	    if (set1.contains(s)){
	        if (i + Arrays.asList(list2).indexOf(s)<min){
			min = i+list2.indexOf(s);		
		}
	    }	
	}
       for(int i=0;i<list1.length;i++){
            String s = list1[i];
	    if (set1.contains(s)){
	        if (i + Arrays.asList(list2).indexOf(s)==min){
			str.add(s);		
		}
	    }	
	}      
      String[] res = new String[str.size()];
      for(int i=0;i<str.size();i++){res[i]=str.get(i);}
      return res; 

    }
}
