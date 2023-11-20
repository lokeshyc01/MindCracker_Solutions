public class BinarySearch {

    static void print(int arr[],int start,int end)
    {
        for(int i = start; i <= end;i++)
        {
            // System.out.print(arr[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean binarySearch(int Arr[],int start,int end,int element)
    {
        print(Arr,start,end);
        if(start > end)
        {
            return false;
        }
        int mid = start + end / 2;

        if(Arr[mid] == element)
        {
            return true;
        }
        
        if(Arr[mid] < element)
        {
            return binarySearch(Arr, mid+1, end, element);
        }
        else
        return binarySearch(Arr, start, mid - 1, element);
    }
    public static void main(String arr[])
    {
        int Arr[] = new int[] {1,2,3,4,5,6};

        boolean ans = binarySearch(Arr,0,Arr.length - 1,9);
        System.out.println(ans);
    }
}
