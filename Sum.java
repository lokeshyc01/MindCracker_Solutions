import java.util.Arrays;

public class Sum 
{
    public static int ans = 0;
    public static int sum(int Arr[],int size)
    {

        if(size == 1)
        {
            return Arr[0];
        }
        
         return sumHelper(Arr,0,size,0);
    }
    public static int sumHelper(int arr[],int idx,int size,int sum)
    {
        if(idx == size)
        {
            return sum;
        }
        int currentSum = sum + arr[idx];
        return sumHelper(arr, idx + 1, size, currentSum);

    }
        public static void main(String[] args) {
            int arr[] = new int[]{1,2,3,4,5,6};
            int result = sum(arr,arr.length);
            System.out.println(result);
        }
}
