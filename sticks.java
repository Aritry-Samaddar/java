import java.util.*;

public class sticks {

	static List<Integer> al = new ArrayList<>();
    static Queue<String> q = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(4, 1, 2, 3);
        String ans = " ";
        for(int i = 0; i < 5; i++) {
            ans = q.remove();
        }
        al.add(ans.charAt(0) - '0');
        al.add(ans.charAt(1) - '0');
        System.out.println(al);
	}

	static void rec(int n, int first, int mid, int last) {
        if(n == 1) {
            q.add(String.valueOf(first) + String.valueOf(last));
            return;
        }
        rec(n - 1, first, last, mid);
        q.add(String.valueOf(first) + String.valueOf(last));
        rec(n - 1, mid, first, last);
    }
}
