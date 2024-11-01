package SkillBuilderStack;

public class StackTest 
{
    public static void main(String[] args) 
    {
        // Testing Stack2
        System.out.println("Testing Stack2:");
        Stack2 stack2 = new Stack2(3);
        
        stack2.push("Hello");  
        stack2.push(42);
        stack2.push(3.14);
        
        System.out.println("Peek: " + stack2.peek());
        System.out.println("Pop: " + stack2.pop());
        System.out.println("Pop: " + stack2.pop());
        System.out.println("Pop: " + stack2.pop());
        
   
        // Testing Stack3
        System.out.println("Testing Stack3:");
        Stack3 stack3 = new Stack3();
        
        stack3.push("Dynamic");
        stack3.push(100);
        stack3.push(true);
        stack3.push(3.14159);
        
        System.out.println("Size: " + stack3.size());
        System.out.println("Peek: " + stack3.peek());
        
        while (!stack3.isEmpty()) 
        {
            System.out.println("Pop: " + stack3.pop());
        }
    }
}