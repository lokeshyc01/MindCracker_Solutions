public class MergeSort
{

    public static void merge(int arr[],int start,int end)
    {
        int mid = start + end / 2;

        int flen = mid - start + 1;
        int slen = end - mid;

        int first[] = new int [flen];
        int second[] = new int[slen];

        int icnt =start;
        int jcnt = mid;
        int mainIndex = 0; 
        while(icnt < flen && jcnt < slen)
        {
            if(first[icnt] < second[jcnt])
            {
                arr[mainIndex++] = first[icnt++];
            }
            else
            {
                arr[mainIndex++] = second[jcnt++];
            }
        }

        while (icnt < flen) {
            arr[mainIndex++] = first[icnt++];
        }

        while(jcnt < slen)
        {
            arr[mainIndex++] = second[jcnt++];
        }
    }

    public static void mergesort(int arr[] , int start , int end)
    {
        if(start >= end)
        {
            return ;
        }
        int mid = start + end / 2;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);

        merge(arr,start,end);
    }
    public static void main(String args[])
    {
       int arr [] = new int[] {20,9,21,3};
       mergesort(arr,0,arr.length - 1);

       for(int i : arr)
       {
            System.out.println(i + " ");
       }
    }
}
