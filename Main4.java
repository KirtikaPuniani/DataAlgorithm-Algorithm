package datastructures.LinkedList;

public class Main4 
{
	public static void main(String[] args)
	{
		LinkedList5 myLinkedList = new LinkedList5(1);
		myLinkedList.append(2);
		
		//myLinkedList.printList();
		System.out.println(myLinkedList.removeLast()); //returns 2 nodes
		System.out.println(myLinkedList.removeLast()); //returns 1 nodes
		System.out.println(myLinkedList.removeLast()); //returns 0 nodes
		
		
		//System.out.println(myLinkedList.removeLast().value);
		//System.out.println(myLinkedList.removeLast().value);
		//System.out.println(myLinkedList.removeLast().value);
	}
}
