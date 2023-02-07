package misc.big_o;

public class Main {
	public static void printItems(int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		printItems(10);
	}
	
}

/*this code is O(n) because value of n in this code is 10 and we did 10 operations in for loop
 * O(n) is always straight line ie its proportional*/
 
