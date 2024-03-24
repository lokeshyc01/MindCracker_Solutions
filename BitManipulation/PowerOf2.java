public class PowerOf2 {

    public static boolean chekcPower(int n)
    {
        while(n != 1)
        {
            if(n % 2 != 0)
            return false;

            n = n / 2;
        }

        return true;
    }

    public static boolean checkPower(int N)
    {
        if(N == 0) return false;

        return (N & (N-1)) == 0;
        //return N & (N & (N-1)) == 0;
    }
    public static void main(String[] args) {
        
    }
}
