import java.util.*;

class pattern 
{

public static void main(String[]args)
{

	Scanner sc= new Scanner(System.in);

	System.out.println("enter the limt of pattern");

	int n = sc.nextInt();

    for(int i=1; i<=n; i++)
	{

		for(int j=1; j<=i; j++)
		{

			System.out.print("*");

        }
    System.out.println();
    }
 } 
}