class nestedFor 
{
  public static void main(String[] args) 
  {

    int weeks = 4;
    int days = 7;

    // outer loop
    for (int i = 1; i <= weeks; ++i) 
	{
      System.out.println("Week:" + i);

      // inner loop
      for (int j = 1; j <= days; ++j)
		  {
        System.out.println("  Day: " + j);
      }
    }
  }
}