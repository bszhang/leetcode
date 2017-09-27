class Solution {
    public String[] findWords(String[] words) {
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";
        List<String> list = new ArrayList<String>();
        
        String[] result = {};      
        String[] rows = {row1, row2, row3};
        for(String word:words){
            for(String row : rows){
               boolean find = false;
               boolean row_changed = false;
               for(int i=0;i<word.length();i++){
                   // if did not find in this row, change row
                   if (row.indexOf(word.charAt(i)) == -1){
                      row_changed = true;
                      break;
                   }
                   if (i == word.length()-1){
                       find = true;
                   }
               }
               if(row_changed){
                     continue; 
               }
               if( find ){
                   list.add(word);
               }
            }    
        }
        String[] array = list.toArray(new String[0]);
        return array;
    }
}
