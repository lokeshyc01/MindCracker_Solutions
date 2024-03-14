public class Factorial {
    // public static long factorial(int digit)
    // {
    //      long fact = 1;

    //     for(int i = 1; i<=digit;i++)
    //     {
    //         fact = fact * i;
    //     }
    //     return fact;
    // }

    public static long factorial(int digit)
    {
        if(digit == 0)
        {
            return 1;
        }
        if(digit == 1)
        {
            return 1;
        }
        long fact = 1;
        return fact*factorial(digit - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(40));
    }
}
