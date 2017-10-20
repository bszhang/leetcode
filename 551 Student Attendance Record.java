class Solution {
    public boolean checkRecord(String s) {
        int aCount=0;
        boolean continousL1=false;
        boolean continousL2=false;
        if (s==null || s.length()==0) return true;
        for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if (c== 'A') aCount++;
           if (aCount==2) return false;
           if ((c=='L') && (continousL1==true) && (continousL2==true)) return false;
           if ((c=='L') && (continousL1==true)) continousL2 = true;
           if (c=='L') continousL1=true;
           else {continousL1 = false; continousL2 = false;}
        }
        return true;
    }
}
