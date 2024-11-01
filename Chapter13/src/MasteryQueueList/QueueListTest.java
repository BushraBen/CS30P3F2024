package MasteryQueueList;

public class QueueListTest 
 
{
    public static void main(String[] args) 
    {
        // Create a new queue
        QueueList queue = new QueueList();
        
        // Test the enqueue
        System.out.println("Testing enqueue operations:");
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        System.out.println("Queue size: " + queue.size());  // print 3
        
        // Test the peek
        System.out.println("Testing peek operation:");
        System.out.println("Front element: " + queue.peek());  // print "First"
        
        // Test the dequeue
        System.out.println("Testing dequeue operations:");
        System.out.println("Removed: " + queue.dequeue());  // print "First"
        System.out.println("Removed: " + queue.dequeue());  //  print "Second"
        System.out.println("Queue size: " + queue.size());  //  print 1
        
        // Test isEmpty
        System.out.println("Testing isEmpty:");
        System.out.println("Is queue empty? " + queue.isEmpty());  // print false
        queue.dequeue();  
        
        System.out.println("Is queue empty now? " + queue.isEmpty());  // print true
        
        // Test the exception handling
        System.out.println("Testing exception handling:");
        try 
        {
            queue.dequeue();  // Should "throw exception"
        } catch (IllegalStateException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
