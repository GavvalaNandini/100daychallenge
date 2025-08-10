package com.palle;

public class Day6 {

    public static void main(String[] args) {
        Single1 s = new Single1();
        s.addnode(20);
        s.addnode(30);
        s.addnode(40);
        s.display();
        s.Insertend(50);
        s.display1();
        s.deletend();
        s.display1();
    }

    static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Single1 {
        Node root;
        public void addnode(int val) {
            Node n = new Node(val);
            if (this.root == null) {
                root = n;
                return;
            }
            Node temp = this.root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        public void display() {
            Node temp = this.root;
            while (temp != null) {
                System.out.print(temp.val + "-->");
                temp = temp.next;
            }
            
        }
        public void Insertend(int val) {
        	
        	Node n=new Node(val);
        	if(root==null) {
        		root=n;
        	}
        	else {
        		Node temp=this.root;
        		while(temp.next!=null) {
        			temp=temp.next;
        		}
        		temp.next=n;
        	}
        }
        	public void display1() {
                Node temp = this.root;
                while (temp != null) {
                    System.out.print(temp.val + "-->");
                    temp = temp.next;
                }
                
            }
        	public void deletend() {
        		if(this.root==null) {
        			System.out.println("list is empty");
        			
        		}
        		if(root.next==null) {
        			root=null;
        		}
        		Node temp=this.root;
        		while(temp.next.next!=null) {
        				temp=temp.next;
        			
        		}
        		temp.next=null;
        }
    }
}
  
