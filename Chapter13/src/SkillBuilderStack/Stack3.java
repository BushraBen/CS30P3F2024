package SkillBuilderStack;

import java.util.ArrayList;

public class Stack3 

{
    private ArrayList<Object> elements;
    
   public Stack3() 
   {
        elements = new ArrayList<>();
    }
    
    public void push(Object item) 
    {
        elements.add(item);
    }
    
    public Object pop() 
    {
        if (!isEmpty()) 
        {
            return elements.remove(elements.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public Object peek() 
    {
        if (!isEmpty()) 
        {
            return elements.get(elements.size() - 1);
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public boolean isEmpty() 
    {
        return elements.isEmpty();
    }
    
    public int size() 
    {
        return elements.size();
    }
}



