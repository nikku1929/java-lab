import java.util.Scanner;
class arraySum{
   public static void main(String args[])
   {
	Scanner scanner = new Scanner(System.in);
      	int[] array = new int[10];
     	int sum = 0;
      	System.out.println("Enter 10 elements:");
     	for (int i=0; i<10; i++)
     	 {
    	  array[i] = scanner.nextInt();
     	 }
      	for( int num : array)
	 {
          sum = sum+num;
     	 }
      		System.out.println("Sum of array elements is:"+sum);
   }
}