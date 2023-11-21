public class FirstandLastPos {

  public static void printFlow(int arr[], int start, int end) {
    for (int iCnt = start; iCnt < end; iCnt++) {
      System.out.println(arr[iCnt]);
    }
  }

  public static void firstAndLastPost(int arr[], int element) {
    int start = 0;
    int end = arr.length;
    int mid = start + end / 2;
    int ans = -1;
    int first = findFirst(arr, start, mid, element,ans);
    
    int last = findLast(arr, mid + 1, end, element,ans);
    if(first <= 0 && last >= 0)
    {
        System.out.println("First => "+last+" Last => "+last);
    }
    else if(first >= 0 && last <= 0)
    {
        System.out.println("First => "+first+" Last => "+first);
    }
    else if(first <= 0 && last <= 0)
    {
        System.out.println("First => "+first+" Last => "+last);
    }
    else if(first >= 0 && last >= 0)
    {
        System.out.println("First => "+first+" Last => "+last);
    }
  }

  public static int findFirst(int arr[], int start, int end, int element,int ans) {
    // base conditions
    
    System.out.println("in findfirst");
    printFlow(arr,start,end);
    if (start > end) {
      return ans;
    }
    int mid = start + end / 2;
    if (arr[mid] == element) {
      ans = mid;
      end = mid - 1;
    } else if (arr[mid] > element) {
      return findFirst(arr, start, end, element,ans);
    }
    return findFirst(arr, mid + 1, end, element,ans);
    // recursive relation

  }

  public static int findLast(int arr[], int start, int end, int element,int ans) {
    System.out.println("in findlast");
   
    printFlow(arr,start,end);
    if (start > end) {
      return ans;
    }

    int mid = (start + end) / 2;

    if (arr[mid] == element) {
      ans = mid;
      start = mid + 1;
    } else if (arr[mid] > element) {
      return findLast(arr, start, mid - 1, element,ans);
    }
    return findLast(arr, start, end, element,ans);
  }

  public static void main(String args[]) {
    int arr[] = new int[] { 1, 2, 4, 5, 5, 6 };
    firstAndLastPost(arr, 5);
  }
}
