import java.util.Scanner;
 
class addMatrix
{
public static void main(String args[])
{
int row, col,i,j;//decleared variable.
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();

 //create array to store the value of int.
int arr[][] = new int[row][col];
int brr[][] = new int[row][col];
int crr[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix1");//store the value of 1st matrix
 
for ( i= 0 ; i < row ; i++ )
{ 
 
for ( j= 0 ; j < col ;j++ )
arr[i][j] = in.nextInt();
 
System.out.println();
}
System.out.println("Enter the elements of matrix2");// store the value of second matrix.
 
for ( i= 0 ; i < row ; i++ )
{
 
for ( j= 0 ; j < col ;j++ )
brr[i][j] = in.nextInt();
 
System.out.println();
}
 
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
crr[i][j] = arr[i][j] + brr[i][j] ; 
 
System.out.println("Sum of matrices:-");//add the both matrix
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(crr[i][j]+"\t");
 
System.out.println();
}
 
}
