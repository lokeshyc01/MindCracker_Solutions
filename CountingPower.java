public class CountingPower {
    public static int countPowerRecursion(int x,int n)
    {
        if(n == 0) return 1;

        int temp = countPowerRecursion(x,n/2);
        temp = temp * temp;

        if(n % 2 == 0)
        {
            return temp;
        }
        else
        {
            return temp * x;
        }
    }

    public static int countPower(int x , int n)
    {
        int res = 1;
        while(n > 0)
        {
            if(n % 2 != 0)
            {
                res = res * x;
            }
            x = x * x;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
