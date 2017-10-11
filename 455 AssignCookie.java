import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
		 if (g == null || g.length == 0) return 0;
		 if (s == null || s.length == 0) return 0;
		 Arrays.sort(g);
		 Arrays.sort(s);
		 int sLength = s.length;
		 int gLength = g.length;
		 if(s[s.length-1]<g[0] ) return 0;
		 if (s[0]>g[g.length-1]) return Math.min(s.length,g.length);
		 int i = sLength-1;
                 int j = gLength-1;
                 int res = 0;
                 while(i>=0 && j>=0){
			 while(j>=0 && i>=0 && s[i]<g[j] ){
                                j--;
			 }
                         if (j<0 || j<0) break;
                	 while(j>=0 && i>=0 && s[i]>=g[j] ){
                                i--;
				j--;
				res +=1;
			 }
		 }	 
                 return res;
    }
}
