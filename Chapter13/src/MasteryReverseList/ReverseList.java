package MasteryReverseList;

import java.util.Stack;
import java.util.Scanner;

public class ReverseList 
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int maxNumbers = 10;
        
        while (count < maxNumbers) 
        {
            System.out.print("Enter a number (999 to quit): ");
            int number = scanner.nextInt();
            
            if (number == 999) 
            {
                break;
            }
            
            stack.push(number);
            count++;
        }
        
        System.out.print("The list reversed is: ");
        while (!stack.isEmpty()) 
        {
            System.out.print(stack.pop() + " ");
        }
        
        scanner.close();
    }
}
