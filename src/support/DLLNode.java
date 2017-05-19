/************************************************************************************************************
 * 										Mentesnot Aboset
 * **********************************************************************************************************
 * 
 * This class implements Doubly linked list node set and get methods
 * 
 * **********************************************************************************************************/
package support;

public class DLLNode<T> {
	protected DLLNode<T> next;        //next node reference
	protected DLLNode<T> previous;    //previous node reference
	protected T data;				  //data in the node
	
	public DLLNode(T data) 
	//DLLNode constructor with one argument
	{
		  this.data = data;
	      next = null;
	      previous = null;
	}

	public DLLNode<T> getNext()
	//returns the next node in this list
	{
		return next;
	}

	public void setNext(DLLNode<T> next) 
	//sets the next node in the list
	{
		this.next = next;
	}

	public T getData() 
	//returns the data in this node
	{
		return data;
	}

	public void setData(T data) 
	//sets the data in this node
	{
		this.data = data;
	}
	
	public DLLNode<T> getPrevious() 
	//gets the previous node in this list
	{
		return previous;
	}
	
	public void setPrevious(DLLNode<T> previous) 
	//sets the previous node in this list
	{
		this.previous = previous;	
	}

}
