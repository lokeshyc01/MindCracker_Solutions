import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) 
	{
		String result [] = str.toString().split(" "); 
		StringBuilder newString = new StringBuilder();    //initialized empty stringbuilder

		if(result.length > 1)
		{
			for(int iCnt = 0;iCnt < result.length;iCnt++)
			{
				if(iCnt == result.length - 1)
				{
					
					newString.append(result[iCnt]);    //at last only append the string
					break;
				}
				newString.append(result[iCnt]);
				newString.append("@40");
			}
			return newString;
		}
		return str;
	}
}