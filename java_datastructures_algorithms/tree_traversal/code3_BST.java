import java.io.File;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class Node {
    Node left,right;
    int data;
    Node(int data) {
        this.data=data;
        left=right=null;
    }
}

class BST {

    public static int getHeightIterarive(Node root) {
        if(root == null) return 0;
        int hmax = 1;
        int htmp = 1;
        Deque<Integer> stackH = new LinkedList<>(); stackH.addFirst(0);
        Deque<Node> stack = new LinkedList<>(); stack.addFirst(null);
        for(Node current = root; current != null;) {
            System.out.println(current.data);
            if(current.right != null) {
                stackH.addFirst(htmp + 1);
                stack.addFirst(current.right);
            }
            if(current.left != null) {
                htmp += htmp;
                current = current.left;
            } else {
                current = stack.removeFirst();
                htmp = stackH.removeFirst();
                hmax = hmax > htmp ? hmax: htmp;
            }
        }
        return hmax;
    }

	public static int getHeight(Node root) {
        int lh = root.left != null ? getHeight(root.left) : 0;
        int rh = root.right != null ? getHeight(root.right) : 0;
        return 1 + (lh > rh ? lh : rh);
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
        String fileName = "BST.txt";
        Node root = null;
        try (Scanner sc = new Scanner(new File(fileName))) {
            int data = 0;
            while(sc.hasNextInt()) {
                data = sc.nextInt();
                //System.out.println(data);
                root = insert(root,data);
            }
        } catch (IOException e) {
            System.err.format("Could not open file %s%n",fileName);
        }

        int height=getHeight(root);
        System.out.format("BST depth(recursive): %d%n", height);
        height = getHeightIterarive(root);
        System.out.format("BST depth(Iterative): %d%n", height);
    }
}
