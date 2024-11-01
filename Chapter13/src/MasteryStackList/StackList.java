package MasteryStackList;

public class StackList 
{
    private Node top;
    private int size;
    
    private class Node 
    {
        Object data;
        Node next;
        
        Node(Object data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public StackList() 
    {
        top = null;
        size = 0;
    }
    
    public void push(Object item) 
    {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    public Object pop() 
    {
    	 if (isEmpty()) 
         {
             throw new IllegalStateException("Stack is empty");
         }
        Object item = top.data;
        top = top.next;
        size--;
        return item;
    }
    
    public Object peek() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }
    
    public boolean isEmpty() 
    {
        return top == null;
    }
    
    public int size()
    {
        return size;
    }
}
