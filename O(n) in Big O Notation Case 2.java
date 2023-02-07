/* 
This is the case of Drop Constants
In this 2 for loops are used with each O(n) complexity.In this case n+n = 2n but we drop the constants and write it as O(n) only
*/

package misc.big_o;

public class Main2 {
	public static void printItems(int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(i);
		}
		
		for(int j=0; j<n; j++)
		{
			System.out.println(j);
		}
	}
	
	public static void main(String[] args)
	{
		printItems(10);
	}
	
}
