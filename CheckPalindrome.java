public class CheckPalindrome 
{
    public static boolean checkPalindrome(char arr[],int i,int j)
    {
        // base condition
        if(i > j)
        {
            return true;
        }

        if(arr[i] != arr[j])
        {
            return false;
        }

       return checkPalindrome(arr, i+1,j-1);
    }
    public static void main(String[] args) {
        String str = "acbbca";
        boolean status = checkPalindrome(str.toCharArray(),0,str.toCharArray().length - 1);
        if(status)
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }    
}
