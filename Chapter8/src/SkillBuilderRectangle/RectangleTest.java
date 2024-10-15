package SkillBuilderRectangle;

public class RectangleTest 
{
    public static void main(String[] args) 
    {
        Rectangle box1 = new Rectangle(4, 7);
        System.out.println("Box1: " + box1);

        Rectangle box2 = new Rectangle(2, 8);
        System.out.println("Box2: " + box2);
        
        Rectangle box3 = new Rectangle(4, 7);
		System.out.println("Box3: " + box3);
                
        //Equals method//
        System.out.println("Testing equals method:");
        
        System.out.println("Box1 equals Box2: " + box1.equals(box2));
        
        System.out.println("Box1 equals Box3: " + box1.equals(box3));


     //CompareTo Method//
        
        System.out.println("Testing compareTo method:");
        
        System.out.println("Box1 compareTo Box2: " + box1.compareTo(box2));
        
        System.out.println("Box1 compareTo Box3: " + box1.compareTo(box3));
        
        System.out.println("Box2 compareTo Box1: " + box2.compareTo(box1));

        System.out.println("Testing compareToArea method:");
        
        System.out.println("Box1 compareToArea Box2: " + box1.compareToArea(box2));
        
        System.out.println("Box1 compareToArea Box3: " + box1.compareToArea(box3));
        
        System.out.println("Box2 compareToArea Box1: " + box2.compareToArea(box1));
    }
}
