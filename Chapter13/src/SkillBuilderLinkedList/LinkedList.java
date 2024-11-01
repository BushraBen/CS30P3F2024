package SkillBuilderLinkedList;

public class LinkedList 
{
    private Node head;
    
    public LinkedList() 
    {
        head = null;
    }
    
    public void addAtFront(String str) 
    {
        Node newNode = new Node(str);
        newNode.setNext(head);
        head = newNode;
    }
    
    public void addAtEnd(String str) 
    {
        Node newNode = new Node(str);
        
        // If list is empty, make new node the head
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.getNext() != null) 
        {
            current = current.getNext();
        }
        current.setNext(newNode);
    }
    
    public void remove(String str) 
    {
        if (head == null) return;
        
        Node current = head;
        Node previous = null;

        if (current.getData().equals(str)) 
        {
            head = current.getNext();
            return;
        }
        
        while (current != null && !current.getData().equals(str)) 
        {
            previous = current;
            current = current.getNext();
        }
        
        if (current != null) 
        {
            previous.setNext(current.getNext());
        }
    }
    
    public String toString() 
    {
        if (head == null) 
        {
            return "There are no items in list.";
        }
        
        StringBuilder listString = new StringBuilder();
        Node current = head;
        
        while (current != null)
        {
            listString.append(current.getData()).append("");
            current = current.getNext();
        }
        return listString.toString();
    }
    
    public int size() 
    {
        Node current = head;
        int count = 0;
        
        while (current != null) 
        {
            count++;
            current = current.getNext();
        }
        return count;
    }    
    
    public void makeEmpty() 
    {
        head = null;
    }    
}