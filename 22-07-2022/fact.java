//Java Program to find the Factorial of a Number
import java.util.*;
public class fact
{
     public static void main(String []args)
     {
        //Take input from the user
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the number: ");
		
        int num=sc.nextInt();
		
        int i=1,fact=1;
		
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);  
     }   
}