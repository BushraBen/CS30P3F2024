package SkillBuilderLinkedList;

public class Node 
{
    private String data;
    private Node next;
    
    public Node(String str) 
    {
        data = str;
        next = null;
    }
    
    public void setNext(Node n) 
    {
        next = n;
    }
    
    public Node getNext() 
    {
        return next;
    }
    
   
    public String getData() 
    {
        return data;
        
    }
}


