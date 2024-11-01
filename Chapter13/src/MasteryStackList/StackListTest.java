package MasteryStackList;

public class StackListTest 
{
    public static void main(String[] args) 
    {
        StackList stack = new StackList();
  
        // Test push
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        
        // Test size
        System.out.println("Size: " + stack.size());  // Should print 3
        
        // Test peek
        System.out.println("Top element: " + stack.peek());  // Should print "Third"
        
        // Test pop
        System.out.println("Popped: " + stack.pop());  // Should print "Third"
        System.out.println("Popped: " + stack.pop());  // Should print "Second"
        
        // Test size again
        System.out.println("Size: " + stack.size());  // Should print 1
        
        // Test isEmpty
        System.out.println("Is empty: " + stack.isEmpty());  // Should print false
        stack.pop();  // Remove last element
        System.out.println("Is empty: " + stack.isEmpty());  // Should print true
    }
}



