package SkillBuilderQueue;

import java.util.ArrayList;

public class Queue3 
{
	private ArrayList<Object> data;
	private int front, rear;
	
	public Queue3()
	{
		data = new ArrayList<Object>();
		front = -1;		
		rear = -1;
	}
	
	public Object front() 
	{
	 	return(data.get(front));
	}
	
	public Object dequeue() 
	{
		Object item;
		
		item = data.get(front);					
		data.remove(front);						
		if (front == rear)
		{
			makeEmpty();
		} 
		else 
		{
			rear -= 1;							
		}
	  	return(item);							
	}
	
	public void enqueue(Object item) 
	{
	 	if (isEmpty()) 
	 	{
	 		
	 		rear = 0;
	 		front = 0;
	 		data.add(item);
	 	} 
	 	else 
	 	{
	 		rear += 1;
	 		data.add(item);
	 	}
	}
	
	public boolean isEmpty() 
	{
	 	if (front == -1 && rear == -1) 
	 	{
	 		return(true);
	 	} 
	 	else 
	 	{
	 		return(false);
	 	}
	}

	public int size() 
	{
	 	if (isEmpty()) 
	 	{
	 		return(0);
	 	} 
	 	else 
	 	{
	 		return(rear - front + 1);
	 	}
	}	
	
	public void makeEmpty() 
	{
	 	front = -1;
	 	rear = -1;
	}
	
}