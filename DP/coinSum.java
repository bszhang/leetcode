public class coinSum{

    // give some coin types, return min number of coins that sum to a number.
    public static int getCoinNum(int[] cointypes, int sum){
		if (cointypes==null || cointypes.length==0) return 0;
                if (sum==0) return 0;
                int[] d = new int[sum+1];
                for(int i=1;i<=sum;i++){
			int min = Integer.MAX_VALUE;
       			for(int j:cointypes){
					if ((i-j>=0)&&(d[i-j]<min)){
						min = d[i-j];
					}
			}
	 	d[i]=min+1;
                System.out.println("d["+i+"] is: "+d[i] );
		}	
		return d[sum];
	}
    public static void main(String[] args){
	
		int[] cointypes = new int[]{1,3,5};
                int sum = 1119;
               int res = getCoinNum(cointypes,sum);
             System.out.println(res);

	}
}
