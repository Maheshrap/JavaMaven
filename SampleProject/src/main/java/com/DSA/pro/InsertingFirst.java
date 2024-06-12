package com.DSA.pro;

class Node1
{
	Node next;
	int data;
}
public class InsertingFirst
{
	Node head;
	
	public void addfirst(int val) {
		
		Node newnode=new Node();
		newnode.data=val;
		newnode.next=head;
		
		head=newnode;
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		
		InsertingFirst insert=new InsertingFirst();
		insert.addfirst(20);
		insert.addfirst(30);
	}
}