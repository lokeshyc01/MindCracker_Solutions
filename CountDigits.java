public class Solution
{
	
	public static int countDigit(int digit)
{
	String s = String.valueOf(digit);
	return s.length();
}


public static int countDigit(int digit)
{
	int count = 0;
	
	while(digit > 0)
{
	count++;
	digit = digit / 10;
}

return count;

}

}