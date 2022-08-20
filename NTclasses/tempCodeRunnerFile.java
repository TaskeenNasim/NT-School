import java.io.*;
import java.util.*;

class Node{
	int val;
	Node next;
	public Node(int val){
		this.val = val;
		this.next = null;
	}
}


public class Main {
	public static void print(Node head){
		Node cur = head;
		while(cur!=null){
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
	}


	public static Node insertHead(Node head,int val){
		Node node = new Node(val);
		node.next = head;
		head = node;
		return head;
	}
	
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		Node head = null;
		for(int i=0;i<n;i++){
			int p = sc.nextInt();
			head = insertHead(head,p);
		}
		print(head);
	}
}
