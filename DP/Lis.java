public class Lis{

    public static int getLis(int[] nums){
        if (nums.length==0 || nums==null) return 0;
	int[] d = new int[nums.length];
	for(int i=1;i<nums.length;i++){
                int max = Integer.MIN_VALUE;
                boolean flag = false;
  		for(int j=0;j<i;j++){
			if ( nums[i]>nums[j] && d[j]>max){
	                    max = d[j];
                            flag=true;
			}
                if (flag)d[i]=max+1;
                else d[i]=1;	
 		     
	}
        System.out.println("d["+i+"] is: "+d[i]);

	}
       return d[nums.length -1];
}

    public static void main(String[] args){


    int [] nums = new int[]{5,3,4,8,6,7};
    int res = getLis(nums);
    System.out.println(res);
} 

}
