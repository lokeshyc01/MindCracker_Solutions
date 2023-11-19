

public class Recursion
{

public static int factorial(int n )
{
	//base criteria where to stop
	if(n == 0)
	{
		return 1;
	}

//bigger problem    smaller problem
	return n * factorial(n-1)
}
public static void main(String arr[])
{
	int n = factorial(5);
	System.out.println(n);
}