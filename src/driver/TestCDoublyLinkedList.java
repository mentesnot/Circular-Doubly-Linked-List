/************************************************************************************************************
 * 										Mentesnot Aboset
 * **********************************************************************************************************
 * 
 * This class tests the Doubly linked list methods
 * Displays the elements of the instance of the Circular Doubly Linked List
 * 
 * **********************************************************************************************************/

package driver;

import circular.doubly.linkedlist.CDoublyLinkedList;

public class TestCDoublyLinkedList {

	public static void main(String[] args) {
		
		   //Creates CDoublyLinkedList cdll - 4 ,3 , 2, 1
		
		   CDoublyLinkedList<Integer> cdll = new CDoublyLinkedList<Integer>(); 
		   
		   cdll.add(4);        //adds items to the list
		   cdll.add(3);
		   cdll.add(2);
		   cdll.add(1);
		   
		   System.out.println("\nOriginal list: ");
		   System.out.println(cdll.toString());  //prints the original list
		   											//Expected output 1,2,3,4
		   
		   System.out.println("\naddFront(9)");
		   cdll.addFront(9);                      //adds new item at the front of the list 
		   System.out.println(cdll.toString());   //Expected output 9,1,2,3,4
		   
		   System.out.println("\naddBack(8)");
		   cdll.addBack(8);							//adds new item at the back of the list
		   System.out.println(cdll.toString());		//Expected output 9,1,2,3,4,8
		   
		   System.out.println("\naddAtPosition(6,2)");
		   cdll.addAtPosition(6, 2);					//inserts new item at the specified position
		   System.out.println(cdll.toString());		//Expected output 9,1,6,2,3,4,8
		   
		   System.out.println("\nremove(4)");
		   cdll.remove(4);							//removes the specified item from the list
		   System.out.println(cdll.toString());		//Expected output 9,1,6,2,3,8
		   
		   System.out.println("\nremoveFront()");
		   cdll.removeFront();						//removes the front item from the list
		   System.out.println(cdll.toString());		//Expected output 1,6,2,3,8
		   
		   System.out.println("\nremoveBack()");
		   cdll.removeBack();						//removes the last item  from the list
		   System.out.println(cdll.toString());		//Expected output 1,6,2,3
		   
		   System.out.println("\nremoveAtPosition(1)");
		   cdll.removeAtPosition(1);					//removes the item in the specified position
		   System.out.println(cdll.toString());		//Expected output 1,2,3
		   
		   System.out.println("\nprintBack()");
		   System.out.println(cdll.printReverse());   //prints the list backwards
		   										      //Expected output 3,2,1
		   
	}

}
