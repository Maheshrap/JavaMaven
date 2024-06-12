package com.DSA.pro;

class Node1
{
	int data;
	Node next;
}
public class InsertingFirst {
	
	Node head;
	InsertingFirst next;
	
	public void addfirst(int val1)
	{
		int val=10;
		
		Node insert=new Node();
		
		insert.data=val;
		insert.next=head;
		head=new Node();
		
		Node temp=head;
		while(temp!= null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		InsertingFirst add=new InsertingFirst();
		add.addfirst(20);
		add.addfirst(30);
	}

}
