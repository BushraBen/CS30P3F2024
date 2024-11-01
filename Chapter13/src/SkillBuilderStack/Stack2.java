package SkillBuilderStack;

public class Stack2 
{
    private Object[] elements;
    private int top;
    private int maxSize;
    
    public Stack2(int size) 
    {
        maxSize = size;
        elements = new Object[maxSize];
        top = -1;
    }
    
    public void push(Object item) 
    {
        if (top < maxSize - 1) 
        {
            elements[++top] = item;
        } else {
            throw new RuntimeException("Stack is full");
        }
    }
    
    public Object pop()
    {
        if (top >= 0) {
            return elements[top--];
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public Object peek() 
    {
        if (top >= 0) {
            return elements[top];
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public boolean isEmpty() 
    {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == maxSize - 1;
    }
}