

public class MergeSort1
{

    public static void mergeSort(int arr[],int left, int right)
    {
        if(left >= right)
        {
            return ;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr,left,mid,mid+1,right);
    }

    private static void merge(int arr[],int leftstart,int leftend,int rightstart,int rightend)
    {
        int elements = (rightend - leftstart) + 1;
        int newArr[] = new int[rightend - leftstart + 1];
        
        int posTracker = -1;
        while(leftstart <= leftend && rightstart <= rightend)
        {
            if(arr[leftstart] < arr[rightstart])
            {
                newArr[++posTracker] = arr[leftstart++];
            }
            else
            {
                newArr[++posTracker] = arr[rightstart++];
            }
        }

        while(leftstart <= leftend)
        {
            newArr[++posTracker] = arr[leftstart++];
        }

        while(rightstart <= rightend)
        {
            newArr[++posTracker] = arr[rightstart++];
        }


        while(elements > 0)
        {
            arr[rightend--] = newArr[posTracker--];
            elements--;
        }
    }
    public static void main(String arr[])
    {
        int newArr[] = {11,8,98,3,2};
        mergeSort(newArr,0,newArr.length - 1);
        for(Integer iNo : newArr)
        {
            System.out.println(iNo);
        }
    }
}