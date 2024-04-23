

public class CheckOneOddOccuring
{
    public static void print(int arr[])
    {
        int res = 0;
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            res = res ^ arr[iCnt];
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        print(new int[]{1,2,3,4,3,3,1,2,4});
    }
}