public class CheckPalindromeRec 
{
    public static boolean palindrom(char arr[],int start,int end)
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
            return palindrom(arr, ++start, --end);
        }
    }
    public static void main(String arr[])
    {
        if(palindrom("abba".toCharArray(),0,"abba".length() - 1))
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }    
}
