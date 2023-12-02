public class StringReverseRecursion 
{
    public static void swap(char start,char end)
    {
        char temp = start;
        start = end;
        end = start;
    }

    public static void reverseString(char string[],int start,int end)
    {
        if(start <= end)
        {
            return ;
        }
        swap(string[start],string[end]);
        System.out.println(string.toString());
        reverseString(string, start++, end--);
    
    }
    public static void main(String arr[])
    {
        String s1 = new String("Lokesh");
        reverseString(s1.toCharArray(), 0, s1.length() - 1);
        // System.out.println(s1.toString());
    }
}
