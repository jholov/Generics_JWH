package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;
/**
 * This class tests the GenericNode and GenericLinked class with different data types
 * @author Jake Holovka
 *
 */
public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		//Testing String data type for GenericLinkedList & GenericNode
		GenericLinkedList<String> newList = new GenericLinkedList<String>();
		
		GenericNode<String> Hnode = new GenericNode<String>();
		Hnode.setData("First String");
		newList.addNode(Hnode);
		Hnode = new GenericNode<String>();
		Hnode.setData("Second String");
		newList.addNode(Hnode);
		
		GenericNode<String> testnode=newList.getList();
		do
		{
			System.out.println(testnode.getData());
			testnode=testnode.getNextNode();
		}while (testnode !=null);
		
		//Testing Integer data type for GenericLinkedList & GenericNode
		GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();
		
		GenericNode<Integer> Inode = new GenericNode<Integer>();
		Inode.setData(2);
		intList.addNode(Inode);
		Inode = new GenericNode<Integer>();
		Inode.setData(4);
		intList.addNode(Inode);
		
		GenericNode<Integer> Tnode=intList.getList();
		do
		{
			System.out.println(Tnode.getData());
			Tnode=Tnode.getNextNode();
		}while (Tnode !=null);
		
		//Testing Double data type for GenericLinkedList & GenericNode
		GenericLinkedList<Double> dubList = new GenericLinkedList<Double>();
		
		GenericNode<Double> Dnode = new GenericNode<Double>();
		Dnode.setData(20.2);
		dubList.addNode(Dnode);
		Dnode = new GenericNode<Double>();
		Dnode.setData(42.4);
		dubList.addNode(Dnode);
		
		GenericNode<Double> DTnode=dubList.getList();
		do
		{
			System.out.println(DTnode.getData());
			DTnode=DTnode.getNextNode();
		}while (DTnode !=null);
		
	}//end main

}//end class
