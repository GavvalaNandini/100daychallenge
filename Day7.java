package com.palle;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single1 s=new Single1();
		s.insertPosition(10, 1);
		s.insertPosition(20, 2);
		s.insertPosition(30, 3);	
		s.insertPosition(40, 4);
		s.display();
		s.delete(3);
		s.delete(2);
		s.display1();

	}
	}
class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
		this.next=null;
	}
}
class Single1{
	Node root;
	public void insertPosition(int val,int pos) {
		Node n=new Node( val);
		if(pos==1) {
			n.next=root;
		    root=n;
		    return;
		}
		Node temp=this.root;
		for(int i=1;i<pos-1&& temp!=null;i++) {
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
		
	}
	
	public void display() {
		Node temp=root;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			temp=temp.next;
			
		}
		System.out.println(" ");
	}
	public void delete(int pos) {
		Node temp=root;
		if(pos==1&& root!=null) {
			root=temp.next;
		}
		
		for(int i=0;i<pos-1&&temp!=null;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
	public void display1() {
		Node temp=root;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			temp=temp.next;
			
		}
	

	
}}

