import java.util.Scanner;

class Node {
    Node left,right;
    int data;
    Node(int data) {
        this.data=data;
        left=right=null;
    }
}

class Solution {

	public static int getHeight(Node root) {
        int lh = root.left != null ? (1 + getHeight(root.left)) : 0;
        int rh = root.right != null ? (1 + getHeight(root.right)) : 0;
        return lh > rh ? lh : rh;
    }

    public static Node insert(Node root, int data) {
        if(root==null) {
            return new Node(data);
        }
        else {
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else {
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while(T-- > 0) {
            int data = sc.nextInt();
            root = insert(root,data);
        }
        int height=getHeight(root);
        System.out.format("%nBST depth: %d%n", height);
    }
}

// example input: number of elements + elements:
// 7
// 3
// 5
// 2
// 1
// 4
// 6
// 7
