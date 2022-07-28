import java.util.Scanner;
class duplicate
{
public static void main(String args[])
{	
	int len;
	Scanner bc = new Scanner(System.in);
	System.out.println("Enter the lenth of array.");
	len = bc.nextInt();
	int arr[] = new int[len];
	System.out.println("Enter the elements of array.");	//Taking input 
	for(int i=0;i<len;i++)
	{
		arr[i] = bc.nextInt();			//Taking input of elements 
	}
	checkArray(len,arr);
	bc.close(); 			//scanner object closed 
}
public static void checkArray(int len,int arr[])
{
	int count = 0;
	for(int j=0;j<len;j++)
	{
		for(int k=j+1;k<len;k++)
		{
			if(arr[j]==arr[k])
			{
				count += 1;		//Checking for the duplicate values.
			}
		}
	}
	if(count>0)
	{
		System.out.println("There are "+count+" duplicate values.");		//Printing the number of duplicate values.
	}
	else 
	{
		System.out.println("There are no any duplicate values.");
	}
}
}