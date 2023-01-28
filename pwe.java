
public class pwe {

	static int answer = Integer.MAX_VALUE;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ith = {0, 0, -1, 1, -1, 1, 1, -1};
		int[] jth = {-1, 1, 0, 0, -1, -1, 1, 1};
		int[][] arr = 
			{{2, 0, 0, 0, 2},
			{0, 0, 0, 0, 0},
			{1, 1, 1, 0, 1},
			{1, 1, 0, 0, 1},
			{1, 0, 1, 1, 1}};
		int m = arr.length;
		int n = arr[0].length;
		boolean[][] vis = new boolean[m][n];
		for(int p = 0; p < m; p++) {
			for(int q = 0; q < n; q++) {
				if(arr[p][q] == 2) {
					answer = Integer.min(rec(arr, p, q, m - 1, 0, Integer.MAX_VALUE, ith, jth, vis), answer);
				}
			}
		}
		System.out.println(answer);
		System.out.println(count);
		
//		System.out.println(rec(arr, 0, 0, m - 1, 1, 0, Integer.MAX_VALUE, ith, jth, vis));
	}

	static int rec(int[][] arr, int i, int j, int m, int sec, int ans, int[] ith, int[] jth, boolean[][] vis) {
		if(i == m && arr[i][j] == 0) {
			count++;
			return Integer.min(ans, sec);
		}
		vis[i][j] = true;
		for(int k = 0; k < 8; k++) {
			if(isSafe(arr, i + ith[k], j + jth[k], vis))
				ans = rec(arr, i + ith[k], j + jth[k], m, sec + 1, ans, ith, jth, vis);
		}
		vis[i][j] = false;
		return ans;
	}
	
	static boolean isSafe(int[][] arr, int i, int j, boolean[][] vis) {
		if(i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != 0 || vis[i][j]) return false;
		return true;
	}
}
