import java.util.*;

public class tests {

	static int index = 4;
	static int fact[]={1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String> S = new Stack<>();
//		run(4, 0, "", S);
//		while(!S.isEmpty()) {
//			System.out.println(S.pop());
//		}
		
		int N = 5;
		int preorder[] = {1, 2, 4, 5, 3};
		int inorder[] = {4, 2, 5, 1, 3};
		int postorder[] = {4, 5, 2, 3, 1};
		
		Node root = buildtree(inorder, postorder, 0, N - 1);
		inorderPrint(root);
//        ArrayList<Integer> al = new ArrayList<>();
//        pre(root, al);
//        System.out.println(al);
	}
	
	static void inorderPrint(Node root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		inorderPrint(root.left);
		inorderPrint(root.right);
	}
	
	static Node buildtree(int[] inorder, int [] postorder, int start, int end) {
        if(start > end) return null;
        int curr = postorder[index];
        index--;
        Node node = new Node(curr);
        if(start == end) return node;
        int pos = search(inorder, start, end, curr);
        if(pos == -1) return node;
        node.right = buildtree(inorder, postorder, pos + 1, end);
        node.left = buildtree(inorder, postorder, start, pos - 1);
        return node;
    }
    
    static int search(int[] inorder, int start, int end, int curr) {
        for(int i = start; i <= end; i++) {
            if(inorder[i] == curr) return i;
        }
        return -1;
    }

    static void pre(Node root, ArrayList<Integer> al) {
        if(root == null) return;
        al.add(root.data);
        pre(root.left, al);
        pre(root.right, al);
    }
    
	static void run(int n, int i, String s, Stack<String> S) {
        if(i >= fact.length) {
            if(n == 0) S.push(s);
            return;
        }
        run(n - fact[i], i + 1, s + String.valueOf(i), S);
        run(n, i + 1, s, S);
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}