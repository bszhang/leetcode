class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int nrow = nums.length;
        if (nrow==0){return nums;}
        int ncol = nums[0].length;
        if (r*c != nrow*ncol){return nums;}
        int[] all = new int[r*c];
        int[][] result = new int[r][c];
        int counter =0;
        for(int i=0;i<nrow;i++){
          for(int j=0; j<ncol; j++){
              all[counter] = nums[i][j];
              counter ++;
          } 
        }
        counter = 0;
       for(int i=0;i<r;i++){
          for(int j=0; j<c; j++){
              result[i][j] = all[counter];
              counter ++;
          } 
        }
       return result;
    }
}
