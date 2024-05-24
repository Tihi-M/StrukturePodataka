import java.util.Scanner;

public class MyList {
	Node head;
	
	public MyList() {
		this.head = null;
	}
	
	public void printList() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public void addFirst(int val) {
		Node novi = new Node(val);
		novi.next = this.head;
		this.head = novi;
		
	}
	
	public void addEnd(int val) {
		Node novi = new Node(val);
		
		if(this.head == null) {
			this.head = novi;
					return;
		}
		Node temp  = this.head;

		while(temp.next!=null)
			temp = temp.next;
		temp.next = novi;
	}
	
	public Node findMid(Node head) {
		if(head == null)
			return null;
		Node res = null;
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null) {
			res = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		return res;
	}
	
	public Node merge(Node left, Node right) {
		Node res = new Node(0);
		Node temp = res;
		while(left != null && right != null) {
			if(left.data < right.data) {
				temp.next = left;
				left = left.next;
			}
			else {
				temp.next = right;
				right = right.next;
			}
			temp = temp.next;
		}
		if(left!=null)
			temp.next = left;
		
		if(right != null)
			temp.next = right;
		
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
		right = mergeSort(right);
		
		return merge(left,right);	
	}
	
	public void insert1() {
		Node temp = this.head;
		while(temp!= null && temp.next != null) {
			Node novi = new Node(temp.data - temp.next.data);
			novi.next=temp.next;
			temp.next= novi;
			temp = temp.next.next;
		}
	}
	
	public Node insert2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("k:");
		int k = sc.nextInt();
		Node temp = new Node(0);
		temp.next = this.head;
		Node curr = temp;
		while(curr.next != null) {
			System.out.println(curr.next.data);

			if(curr.next.data % k != 0) {
				Node novi = new Node(-1);
				novi.next = curr.next;
				curr.next = novi;
				
				curr = curr.next;
				

			}
			curr = curr.next;
		}
		sc.close();
		return temp.next;

		}
	
	public void insert3() {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("a,b:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		Node temp = this.head;
		
		while(temp != null) {
			if(temp.data > a && temp.data < b) {
				Node novi = new Node(0);
				novi.next = temp.next;
				temp.next = novi;
				temp = temp.next;
			}
			temp = temp.next;
		}
		sc.close();
	}
	
	public void insert4() {
		int k,val;
		Scanner sc = new Scanner(System.in);
		System.out.println("k,val:");
		k = sc.nextInt();
		val = sc.nextInt();
		
		Node temp = this.head;
		int count = 0;
		while(temp!= null) {
			if(count == k-1) {
				count = 0;
				Node novi = new Node(val);
				novi.next = temp.next;
				temp.next = novi;
				temp = temp.next;
			}
			else count++;
			temp = temp.next;
		}
		sc.close();
				
	}
	
	public static Node sredina(Node head) {
		if(head == null)
			return null;
		
		Node res = null;
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			res = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return res.next;
	}
	
}
