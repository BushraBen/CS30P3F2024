package SkillBuilderLinkedList;

public class TestLinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        
        // Test addAtFront and addAtEnd
        list.addAtFront("First");
        list.addAtEnd("Second");
        list.addAtEnd("Third");
        
        // Print initial list
        System.out.println("Initial list:");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        
        // Test remove
        list.remove("Second");
        System.out.println("After removing 'Second':");
        System.out.println(list);
        
        // Test makeEmpty
        list.makeEmpty();
        System.out.println("After making empty:");
        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}
