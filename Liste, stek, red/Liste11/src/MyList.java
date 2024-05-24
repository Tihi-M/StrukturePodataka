import java.util.Scanner;
import java.math.*;
public class MyList {
	Node head;
	public MyList() {
		this.head = null;
	}
	
	public static Scanner sc = new Scanner(System.in);
	public void printList() {
		Node temp = this.head;
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public void addFirst(int val_) {
		Node novi = new Node(val_);
		novi.next = this.head;
		this.head = novi;
	}
	
	public void addLast(int val_) {
		Node novi = new Node(val_);
		if(this.head == null) {
			this.head = novi;
			return;
		}
		
		Node temp = this.head;
		while(temp.next != null) 
			temp = temp.next;
		
		temp.next=novi;
	}
	
	public void add(int val_) {
		Node novi = new Node(val_);
		Node temp = this.head;
		Node prev = null;
		while(temp != null  && temp.val < val_) {
			prev = temp;
			temp = temp.next;
		}
		if(prev != null) {
			if(temp != null && temp.val == val_)
				return;
			else {
				prev.next = novi;
				novi.next = temp;
			}
		}
		else {
				this.head = novi;
				novi.next = temp;
		}
	}
	
	
	public Node findMid(Node head) {
		if(head == null)
			return null;
		
		Node res = null;
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			res = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return res;
	}
	
	public Node merge(Node L,Node R) {
		Node res = new Node(0);
		Node temp = res;
		while(L != null && R != null) {
			if(L.val < R.val) {
				temp.next = L;
				L = L.next;
			}
			else {
				temp.next = R;
				R = R.next;
			}
			temp = temp.next;
		}
		if(L != null)
			temp.next = L;
		if(R != null)
			temp.next = R;
		
		return res.next;
		
	}
	
	public Node mergeSort(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node left = head;
		Node right = findMid(left);
		Node temp = right.next;
		right.next = null;
		right = temp;
		
		left = this.mergeSort(head);
		right= mergeSort(right);
		
		return merge(left,right);
	}
	
	public void delete() {
		System.out.println("d,k:");
		int d = sc.nextInt();
		int k = sc.nextInt();
		
		Node temp = this.head;
		Node prev = null;
		while(temp != null) {
			if(Math.abs(temp.val - d) - k< 0.00001) {
				if(prev == null){
					this.head = this.head.next;
					temp = temp.next;
				}
				else {
					prev.next = temp.next;
					temp = temp.next;
				}
			}
			else {
				prev = temp;
				temp = temp.next;
			}
		}
	}
	
	public void groupReverse() {
		System.out.println("k");
		int k = sc.nextInt();
		Node temp = this.head;
		int k2 = 1;
		while(k2 < k) {
			temp = temp.next;
			k2++;
		}
		
		Node kraj = temp.next;
		temp.next=null;
		
		Node prev = null;
		Node nextC = null;
		Node curr = this.head;
		
		while(curr != null) {
			nextC = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextC;
		}
		
		this.head = prev;
		curr = this.head;
		
		while(curr.next != null)
			curr = curr.next;
		curr.next = kraj;
		}
	
	
}
