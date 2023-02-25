package datastructures.LinkedList;

public class Main6
{
	public static void main(String[] args)
	{
		LinkedList7 myLinkedList = new LinkedList7(2);
		myLinkedList.append(1);
		
		//myLinkedList.printList();
		System.out.println(myLinkedList.removeFirst().value); //returns 2 nodes
		System.out.println(myLinkedList.removeFirst()); //returns 1 nodes
		System.out.println(myLinkedList.removeFirst()); //returns 0 nodes
	}
}
