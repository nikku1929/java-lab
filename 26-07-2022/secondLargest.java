 class secondLargest
{
   public static void main(String args[])
   {
      int temp, size;
      int array[] = {104, 210, 255, 163, 496,457};
      size = array.length;

      for(int i = 0; i<size; i++ )
	  {
         for(int j = i+1; j<size; j++)
		 {

            if(array[i]>array[j])
			{
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("Third second largest number is:: "+array[size-2]);
   }
}