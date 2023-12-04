public class CheckPalindromeRec 
{
    public static boolean palindrome(char arr[],int start,int end)
    {
        if(start > end)
        {
            return true;
        }

        if(arr[start] != arr[end])
        {
            return false;
        }
        else
        {
            return palindrome(arr, ++start, --end);
        }
    }
    public static void main(String arr[])
    {
        if(palindrome("abba".toCharArray(),0,"abba".length() - 1))
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }    
}
