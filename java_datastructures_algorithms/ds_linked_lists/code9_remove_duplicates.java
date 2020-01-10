import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
        data=d;
        next=null;
    }
}

class Solution {

    public static Node removeDuplicates(Node head) {
        Node current = head;
        while(current != null && current.next != null) {
            while(current.data == current.next.data) {
                current.next = current.next.next;
                if(current.next == null)
                    break;
            }
            current = current.next;
        }
        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if(head == null)
            head = p;
        else if(head.next == null)
            head.next = p;
        else {
            Node start = head;
            while(start.next != null)
                start = start.next;
            start.next = p;
        }
        return head;
    }

    public static void display(Node head) {
        Node start=head;
        while(start!=null) {
            System.out.print(start.data+" ");
            start=start.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("duplicates.input"));
        Node head = null;
        int T = sc.nextInt();
        while(T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        head = removeDuplicates(head);
        display(head);
        sc.close();
    }
}
