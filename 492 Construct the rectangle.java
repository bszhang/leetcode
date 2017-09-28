import java.lang.Math;
class Solution {
    public int[] constructRectangle(int area) {
        if (area==0){
            return new int[2];
        }
        double root = Math.sqrt(area);
        int floor = (int)root;
        for(int i = floor; i>=1;i--){
            if (area%i==0){
            floor = i;
            break;
            }
        }
        int W1 = floor;
        int L1 = (int)(area/floor);

        int ceil = (int)root + 1;
        for(int i = ceil; i <= area; i++){
            if (area%i==0){
            ceil = i;
            break;
            }
        }
        int L2 = ceil;
        int W2 = (int)(area/ceil);
         
        int [] result = new int[2];
        if ((L2-W2) >= (L1-W1)){result[0]=L1;result[1]=W1;}
        else{
         result[0]=L2;result[1]=W2;
        }
        return result;
    }
}
