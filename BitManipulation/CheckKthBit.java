

public class CheckKthBit
{   
    // 1st solution
    // public static boolean checkBit(int n,int k)
    // {
    //     int x = 1;
    //     for(int i = 0 ; i < k - 1 ; i++)
    //     {
    //         x = x * 2;
    //     }

    //     if((n & x )!= 0)
    //     {
    //         return true;
    //     }
    //     return false;
    // }

    // 2nd solution
    // public static boolean checkBit(int n,int k)
    // {
    //     int x = 1;
    //     for(int i = 0 ; i < k - 1 ; i++)
    //     {
    //         n =n/ 2;
    //     }

    //     if((n & x )!= 0)
    //     {
    //         return true;
    //     }
    //     return false;
    // }

    // optimized solution

    // public static boolean checkBit(int n,int k)
    // {
    //     int x = 1;
    //     x = x << (k-1);

    //     if((n & x )!= 0)
    //     {
    //         return true;
    //     }
    //     return false;
    // }

    public static boolean checkBit(int n,int k)
    {
        n = n >> (k-1);

        if((n & 1 )!= 0)
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