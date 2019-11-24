import java.util.*;
public class DoublyLLReverse 
{
	static Node head;
	static Node tail;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public static void display(DoublyLLReverse li)
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	public static void insert(DoublyLLReverse li,int data)
	{
		Node newNode=new Node(data);
		newNode.prev=null;
		newNode.next=null;
		
		if (head == null) {
            head = newNode;
        } else
        {
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
	}
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     DoublyLLReverse li=new DoublyLLReverse();
     insert(li, 10);
     insert(li, 20);
     insert(li, 30);
     display(li);
     sc.close();
	}

}
