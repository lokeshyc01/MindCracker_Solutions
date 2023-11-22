import java.util.Arrays;

public class ReverseString 
{
    public static String reverseString(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        // String reverse
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = new String("Lokesh");
        str = reverseString(str);
        System.out.println(str);
    }
}
