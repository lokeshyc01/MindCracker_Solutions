public class LinearSerach
{
    public static boolean linearSearch(int Arr[],int size,int element)
    {
        if(size == 0)
        {
            return false;
        }
       return linearSearchHelper(Arr,0,size,element);
    }
    public static boolean linearSearchHelper(int Arr[],int index,int size,int element)
    {
        // base case
        if(index == size)
        {
            return false;
        }

        if(Arr[index] == element)
        {
            return true;
        }
        return linearSearchHelper(Arr, index + 1, size, element);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        boolean ans = linearSearch(arr,arr.length,9);
        System.out.println(ans);
    }
    
}
