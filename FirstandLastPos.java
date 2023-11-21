// public class FirstandLastPos {

//   public static void printFlow(int arr[], int start, int end) {
//     for (int iCnt = start; iCnt < end; iCnt++) {
//       System.out.println(arr[iCnt]);
//     }
//   }

//   public static void firstAndLastPost(int arr[], int element) {
//     int start = 0;
//     int end = arr.length - 1;
//     int ans = -1;
//     int first = findFirst(arr, start, end, element,ans);
//     System.out.println(first +" => 1st postion");
//     int last = findLast(arr, start, end, element,ans);
//     System.out.println("firstpost "+first+" lastpost "+last);
//   }

//   public static int findFirst(int arr[], int start, int end, int element,int ans) {
//     // base conditions
    
//     System.out.println("in findfirst");
//     printFlow(arr,start,end);
//     if (start > end) {
//       return ans;
//     }
//     int mid = start + end / 2;
//     if (arr[mid] == element) {
//       ans = mid;
//       end = mid - 1;
      
//     } else if (arr[mid] > element) {
//       return findFirst(arr, start, end, element,ans);
//     }
//     return findFirst(arr, mid + 1, end + 1, element,ans);
//     // recursive relation

//   }

//   public static int findLast(int arr[], int start, int end, int element,int ans) {
//     System.out.println("in findlast");
   
//     printFlow(arr,start,end);
//     if (start > end) {
//       return ans;
//     }

//     int mid = (start + end) / 2;

//     if (arr[mid] == element) {
//       ans = mid;
//       start = mid + 1;
//     } else if (arr[mid] > element) {
//       return findLast(arr, start - 1, mid - 1, element,ans);
//     }
//     return findLast(arr, start, end, element,ans);
//   }

public class FirstandLastPos {

  public static void printFlow(int arr[], int start, int end) {
    for (int iCnt = start; iCnt < end; iCnt++) {
      System.out.println(arr[iCnt]);
    }
  }

  public static void firstAndLastPost(int arr[], int element) {
    int start = 0;
    int end = arr.length - 1; // Adjusted the end index
    int first = findFirst(arr, start, end, element);
    int last = findLast(arr, start, end, element);
    System.out.println(first + " " + last);
  }

  public static int findFirst(int arr[], int start, int end, int element) {
    if (start > end) {
      return -1; // Element not found
    }

    int mid = (start + end) / 2;

    if (arr[mid] == element && (mid == 0 || arr[mid - 1] != element)) {
      return mid;
    } else if (arr[mid] < element) {
      return findFirst(arr, mid + 1, end, element);
    } else {
      return findFirst(arr, start, mid - 1, element);
    }
  }

  public static int findLast(int arr[], int start, int end, int element) {
    if (start > end) {
      return -1; // Element not found
    }

    int mid = (start + end) / 2;

    if (arr[mid] == element && (mid == arr.length - 1 || arr[mid + 1] != element)) {
      return mid;
    } else if (arr[mid] > element) {
      return findLast(arr, start, mid - 1, element);
    } else {
      return findLast(arr, mid + 1, end, element);
    }
  }
  public static void main(String args[]) {
    int arr[] = new int[] { 1, 2, 4, 5, 5, 6 };
    firstAndLastPost(arr, 6);
  }
}
