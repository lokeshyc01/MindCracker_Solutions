public class GCD {
    public static int gcd(int no1,int no2)
    {
        int min = Math.min(no1, no2);
        int iRes = 1;
        for(int iCnt = 2 ; iCnt <= min/2 ; iCnt++)
        {
            if(no1 % 2 == 0 && no2 % 2 == 0)
            {
                iRes = iCnt;
            }
        }
        return iRes;
    }
// gcd using euclidian algorithm
    public static int euclidianAlgo(int a,int b)
    {
       while( a != b)
       {
        if(a > b)
        {
           a =  a-b;
        }
        else
        {
           b =  b - a;
        }
       }
       return a;
    }

// optimized way of gcd
public static int optimizedGCD(int a,int b)
{
        if(b == 0)
        return a;
        else
        return gcd(b, a%b);
}
    public static void main(String[] args) {
        System.out.println(gcd(4,7));
    }
}
