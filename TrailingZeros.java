public class TrailingZeros
{
    public static int trailingZeros(int digit)
    {
        int res = 0; 
        for(int i = 5; i <= digit; i = i * 5)
        {
            res = res + digit / i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeros(251));
    }
}