import java.util.*;

public class allComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		int maxEle = 0;
		int maxWgt = 0;
		int max = 80;
		int n = 4;
		int[] a = {10, 20, 30, 40};
		rec(a, 0, 0, s1);
		int[] b = {2, 4, 6, 8};
		rec(b, 0, 0, s2);
		System.out.println(s1);
		System.out.println(s2);
		int m = s1.size();
		for(int i = 0; i < m; i++) {
			int p = s1.pop();
			int q = s2.pop();
			if(p > maxEle && q <= max) {
				maxEle = p;
				maxWgt = q;
			}
		}
		System.out.println(maxEle);
		System.out.println(maxWgt);
	}

	static void rec(int[] a, int i, int sum, Stack<Integer> s) {
		if(i >= a.length) {
			s.push(sum);
			return;
		}
		rec(a, i + 1, sum + a[i], s);
		rec(a, i + 1, sum, s);
	}
}
