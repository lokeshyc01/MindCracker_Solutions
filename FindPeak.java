public class FindPeak 
{
    public static int findPeak(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + end / 2;
        return peakHelper(arr,start,end,mid);
    }

    public static int peakHelper(int arr[],int start,int end,int mid)
    {
        if(start > end)
        {
            return -1;
        }
        
        if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
        {
            return arr[mid];
        }

        if(arr[mid] < arr[mid + 1])
        {
           return peakHelper(arr, mid + 1, end,(start + end) /2 );
        }
        else
        {
            return peakHelper(arr, start, mid,(start + end) / 2);
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,10,5,2};
        int peak = findPeak(arr);
        System.out.println(peak);
    }    
}
