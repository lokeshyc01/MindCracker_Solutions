import java.util.Scanner;

public class RowSum {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[4][4];
	System.out.println("Enter elements");
	int RowSum = 0;
    for (int iCnt = 0; iCnt < 4; iCnt++) 
	{
		RowSum = 0;
      for (int jCnt = 0; jCnt < 4; jCnt++)
	   {
        arr[iCnt][jCnt] = sc.nextInt();
		RowSum += arr[iCnt][jCnt];
      }
	  System.out.println(iCnt+" Row sum => "+RowSum);
    }




	System.out.println(arr.toString());
  }
}
