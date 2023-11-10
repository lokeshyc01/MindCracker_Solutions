import java.util.* ;

import com.sun.net.httpserver.Authenticator.Result;

import java.io.*; 

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		
		int Result[] = new int[nRows * mCols];
		int iCnt = 0;
		for(int col = 0; col < mCols; col++)
		{
			if(col % 2 == 0)
			{
				for(int row = 0; row < nRows; row++)
				{
					
					Result [iCnt] = arr[row][col];
					iCnt++;
					// System.out.print(arr[row][col] + " ");
				}
			}
			else
			{
				for(int row = nRows - 1; row >= 0 ; row--)
				{
					Result[iCnt] = arr[row][col];
					iCnt++;
					// System.out.print(arr[row][col] + " ");
				}
			}
		}
		return Result;
	}
}


