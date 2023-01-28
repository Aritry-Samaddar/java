import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(addString("1", "99"));
		
		String num = "ari";
		System.out.println(num.substring(num.length()));
		
//		int i = 10;
//		int num = 0;
//		while(i > 0) {
//            int dig = i % 10;
//            num += dig * dig;
//            i = i / 10;
//        }
//        System.out.println(num);
//        
//        int j = (int) Math.pow(6, 0.5);
//        System.out.println(j);
//        
//        System.out.println(Character.getNumericValue('9'));
		
//		System.out.println(rec(8));
		
//	    double ans = 0;
//		int n = 2;
//		int x = 3;
//		System.out.println(recs(n, x, 1, 2, false, ans));
//		System.out.println(fact(4));
//		System.out.println(ans);
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		String c = String.valueOf(a);
//		int even = 0;
//		int odd = 0;
//		for(int i = 0; i < c.length(); i++) {
//			if(i % 2 == 0) {
//				odd += Character.getNumericValue(c.charAt(i));
//			} else {
//				even += Character.getNumericValue(c.charAt(i));
//			}
//		}
//		System.out.println(Math.abs(even - odd));
		
//		int[] arr = {5, 6, 7, 8};
//		StringBuilder s = new StringBuilder();
//		for(int i : arr) {
//			s.append(i);
//		}
//		System.out.println(Integer.parseInt(s.toString()) + 1);
		
//		int[] arr = {5, 6, 7, 8};
//		String s = "";
//		for(int i : arr) {
//			s += i;
//		}
//		System.out.println(Integer.parseInt(s) + 1);
		
//		int[] arr = {5, 6, 7, 8};
//		String s = "";
//		for(int i : arr) {
//			s += i;
//		}
//		System.out.println(Long.parseLong(s) + 1);
		
//		int k = 0;
//		k = (k * 10) + '4' - '0';
//		System.out.println(k);
	}
	
	static int val(String a, int pos)
	{
	    if (pos >= a.length() || pos < 0)
	        return 0;
	 
	    //  converting character to integer
	    return (a.charAt(pos) - '0');
	}
	static String addString(String a, String b) {
        String sum = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int t = val(a, i) + val(b, j) + carry;
            sum = String.valueOf(t % 10) + sum;
            carry = t / 10;
            i--;
            j--;
        }
        if(carry != 0) {
            sum = String.valueOf(carry) + sum;
        }
        return sum;
    }

	static int rec(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return rec(n - 1) + rec(n - 2);
	}
	
	static double recs(int n, int x, int p, int f, boolean arg, double ans) {
		if(n == 0) return ans;
		if(arg == false) {
			recs(n - 1, x, p + 2, f + 2, true, ans + ((Math.pow(x, p)) / fact(f)));
		} else {
			recs(n - 1, x, p + 2, f + 2, false, ans - ((Math.pow(x, p)) / fact(f)));
		}
		return ans;
	}
	
	static int fact(int n) {
		if(n == 1) return 1;
		return n * fact(n - 1);
	}
}
