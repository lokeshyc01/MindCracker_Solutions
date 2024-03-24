public class CountBits {
    // public static int countBits(int n)
    // {
    //     int count = 0;
    //     while(n > 0)
    //     {
    //         if(n % 2 == 1)
    //         {
    //             count++;
    //         }
    //         n = n / 2;
    //     }
    //     return count;
    // }
    
    // Brian kerningam's algorithm

    public static int countBitss(int n )
    {
        int count = 0;
        while(n > 0)
        {
            count++;
            n = n & (n-1);
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println(countBits(40));
        System.out.println(countBitss(40));
    }
}
