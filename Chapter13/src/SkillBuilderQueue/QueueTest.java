package SkillBuilderQueue;

public class QueueTest
{
    public static void main(String[] args) 
    {
        // Test Queue2 (Array-based)
        System.out.println("Testing Queue2 (Array-based Queue):");
        Queue2 q2 = new Queue2(5);
        testQueue(q2, "Queue2");

        System.out.println("------------------------");

        // Test Queue3 (ArrayList-based)
        System.out.println("Testing Queue3 (ArrayList-based Queue):");
        Queue3 q3 = new Queue3();
        testQueue(q3, "Queue3");
    }

    private static void testQueue(Object queue, String queueType) 
    {

        if (queueType.equals("Queue2")) 
        {
            Queue2 q = (Queue2) queue;
            System.out.println("Is empty? " + q.isEmpty());


            System.out.println("Enqueuing items...");
            q.enqueue("First");
            q.enqueue("Second");
            q.enqueue("Third");


            System.out.println("Queue size: " + q.size());


            System.out.println("Front item: " + q.front());


            System.out.println("Dequeuing items...");
            System.out.println("Dequeued: " + q.dequeue());
            System.out.println("Dequeued: " + q.dequeue());


            System.out.println("Queue size after dequeue: " + q.size());


            System.out.println("Making queue empty...");
            q.makeEmpty();
            System.out.println("Is empty? " + q.isEmpty());
        } 
        else 
        {
            Queue3 q = (Queue3) queue;
            System.out.println("Is empty? " + q.isEmpty());


            System.out.println("Enqueuing items...");
            q.enqueue("First");
            q.enqueue("Second");
            q.enqueue("Third");
            

            System.out.println("Queue size: " + q.size());


            System.out.println("Front item: " + q.front());


            System.out.println("Dequeuing items...");
            System.out.println("Dequeued: " + q.dequeue());
            System.out.println("Dequeued: " + q.dequeue());
            
            
            System.out.println("Queue size after dequeue: " + q.size());
            
          
            System.out.println("Making queue empty...");
            q.makeEmpty();
            System.out.println("Is empty? " + q.isEmpty());
        }
    }
}