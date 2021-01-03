import java.util.*;

class LinkedList{
	static Node root1,root2;
	static class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
		}
	}
	public int commonNode(Node root1,Node root2){
		Node curr1 = root1;
		Node curr2 = root2;
		int length1 = 0;
		int length2 = 0;
		int d = 0;
		while(curr1!=null){
			length1++;
			curr1=curr1.next;
		}
		while(curr2!=null){
			length2++;
			curr2=curr2.next;
		}
		if(length1>=length2){
			d=length1-length2;
			return commonNodeDiff(d,root1,root2);
		}
		else{
			d=length2-length1;
			return commonNodeDiff(d,root2,root1);
		}
	}
	public int commonNodeDiff(int d, Node root1, Node root2){
		Node curr1 = root1;
		Node curr2 = root2;
		for(int i=0;i<d;i++){
			if(curr1==null)
				return -1;
			curr1=curr1.next;
		}
		while(curr1.next!=null){
			if(curr1.data==curr2.data){
				return curr1.data;
			}
			curr1=curr1.next;
			curr2=curr2.next;
		}
		return -1;
	}
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.root1=new Node(3);
		l.root1.next=new Node(6);
		l.root1.next.next=new Node(9);
		l.root1.next.next.next=new Node(15);
		l.root1.next.next.next.next=new Node(30);
		l.root2=new Node(10);
		l.root2.next=new Node(15);
		l.root2.next.next=new Node(30);
		System.out.println(l.commonNode(root1,root2));
	}	
}
