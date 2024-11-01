package MasteryQueueList;

public class QueueList 
{
    private Node front;
    private Node rear;
    private int size;
    
    // Inner Node class
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
    
    // Constructor
    public QueueList() 
    {
        front = null;
        rear = null;
        size = 0;
    }
    
    // Add element to rear of queue
    public void enqueue(Object item) 
    {
        Node newNode = new Node(item);
        
        if (isEmpty()) 
        {
            front = newNode;
        } else 
        {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }
    
    // Remove and return front element
    public Object dequeue() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        
        Object item = front.data;
        front = front.next;
        size--;
        
        if (isEmpty()) 
        {
            rear = null;
        }
        
        return item;
    }
    
    // Return to the front element without removing
    public Object peek() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }
    
    // Check if the queue is empty
    public boolean isEmpty() 
    {
        return size == 0;
    }
    
    // Return number of elements in queue
    public int size() 
    {
        return size;
    }
}

