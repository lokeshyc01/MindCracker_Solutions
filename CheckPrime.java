public class CheckPrime {
    public static boolean checkPrime(int digit)
    {
        if(digit == 1 || digit == 2) return true;

        if(digit % 2 == 0 || digit % 3 == 0) return false;

        for(int iCnt = 5 ; iCnt * iCnt <= digit ; iCnt = iCnt + 6)
        {
            if(digit % iCnt == 0 || digit % (iCnt + 2) == 0)
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(7383));
    }
}
