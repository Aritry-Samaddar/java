import java.util.*;

public class luckyNum {

	static int ans = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[][] arr = new int[n][m];
		    for(int j = 0; j < n; j++) {
		        for(int k = 0; k < m; k++) {
		            int a = sc.nextInt();
		            arr[j][k] = a;
		        }
		    }
		    func(arr, n, m, 0, 0);
		    System.out.println(ans);
		}
	}
	
	private static void func(int[][] arr, int n, int m, int i, int j) {
	    if(i == n || j == m) return;
	    func(arr, n, m, i + 1, j);
	    func(arr, n, m, i, j + 1);
	    if(arr[i][j] == 1) {
	        int val = adjSum(arr, n, m, i, j, 1);
	        if(val > ans) ans = val;
	    }
	}
	
	private static int adjSum(int[][] arr, int n, int m, int i, int j, int sum) {
	    if(i + 1 < n && arr[i + 1][j] == 1) sum++;
	    if(i - 1 >= 0 && j < m && arr[i - 1][j] == 1) sum++;
	    if(j - 1 >= 0 && arr[i][j - 1] == 1) sum++;
	    if(j + 1 < m && arr[i][j + 1] == 1) sum++;
	    if(i - 1 >= 0 && j - 1 >= 0 && arr[i - 1][j - 1] == 1) sum++;
	    if(i - 1 >= 0 && j + 1 < m && arr[i - 1][j + 1] == 1) sum++;
	    if(i + 1 < n && j - 1 >= 0 && arr[i + 1][j - 1] == 1) sum++;
	    if(i + 1 < n && j + 1 < m && arr[i + 1][j + 1] == 1) sum++;
	    return sum;
	}

//	int counts(Node root, int X, int count) {
//        if(root == null) {
//            if(count == X) return 1;
//            return 0;
//        }
//        count += root.data;
//        counts(root.left, X, count);
//        counts(root.right, X, count);
//        return 0;
//    }
}
