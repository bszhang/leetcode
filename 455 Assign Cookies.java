import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
		 if (g = null || g.length==0) return 0;
		 if (s == null || s.length==0) return 0;
		 Arrays.sort(g);
		 Arrays.sort(s);
		 int sLength = s.length;
		 int gLength = g.length;
		 if(s[s.length-1]<g[0] ) return 0;
		 if (s[0]>g[g.length-1]) return s.length;
		 for(int i=sLength-1, int j = gLength-1;i>=0,j>=0;i--,j--){
			 
		 }
    }
}
