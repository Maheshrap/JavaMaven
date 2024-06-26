package com.DSA.pro;


class Node2
{ 
    int data;
    Node next;
}

public class insertLast
{
    Node head;

    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null)
            head = newNode;
        else
        {
            Node lastNode = head;

            while(lastNode.next != null)
            {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
    }

    public void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {

    	insertLast list = new insertLast();

          System.out.println("Inserting Element: "+10);
          list.addLast(10);
          System.out.println("Inserting Element: "+20);
          list.addLast(20);
          System.out.println("Inserting Element: "+30);
          list.addLast(30);
          System.out.println("Inserting Element: "+40);
          list.addLast(40);

          System.out.println("The LinkedList Elements Are:");
          list.print();
    }
}

