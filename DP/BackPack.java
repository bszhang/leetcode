public class BackPack {
	public static int pack(int[] val, int[] wt, int W) {
		if (val == null || wt == null || val.length == 0 || wt.length == 0)
			return 0;
		if (val.length != wt.length)
			return 0;
		if (W <= 0)
			return 0;
		int N = wt.length;
		// V[i,j] the max value of the FIRST i elements when left volume is j, not to chose i elements from set.  

		int[][] V = new int[N + 1][W + 1];
		for (int i = 0; i <= N; i++) {
			V[0][i] = 0;
		}
		for (int i = 0; i <= W; i++) {
			V[i][0] = 0;
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= W; j++) {
				if (j >= wt[i - 1]) {
					V[i][j] = Math.max(V[i - 1][j - wt[i - 1]] + val[i - 1],
							V[i - 1][j]);
				} else {
					V[i][j] = V[i - 1][j];
				}

			}
			System.out.println("V[" + i + "] is: " + V[i][W]);
		}
		return V[N][W];
	}

	public static void main(String[] args) {
		int[] val = new int[] { 20, 10, 12 };
		int[] wt = new int[] { 5, 4, 3 };
		int W = 10;
		int result = pack(val, wt, W);

		System.out.println(result);
	}
}
