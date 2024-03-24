

public class CheckKthBit
{   

    public static boolean checkBit(int n,int k)
    {
        int x = 1;
        for(int i = 0 ; i < k - 1 ; i++)
        {
            x = x * 2;
        }

        if((n & x )!= 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String arr[])
    {
        System.out.println(checkBit(7,2));
    }
}