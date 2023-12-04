public class InsertionSort
{

public static void InsertionSort(int arr[])
{
	for(int iCnt = 0; iCnt < arr.length;iCnt++)
{
	for(int jCnt = 0 ; jCnt < iCnt ; jCnt++)
{
	if(arr[iCnt] < arr[jCnt])
{
	int temp = arr[iCnt];
	arr[iCnt] = arr[jCnt];
	arr[jCnt] = temp;
}
}
}
}

public static void main(String args[])
{

	int arr[] = new int[]{20,15,30,9,5};
	InsertionSort(arr);	
	for(int iNo : arr)
	{
		System.out.println(iNo);
	}
}

}