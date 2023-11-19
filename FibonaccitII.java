import java.util.Scanner;

public class FibonaccitII {

    public static int findNumber(int n)
    {
        if(n < 2)
        {
            return n;
        }
        
        int start = 0;
        int end = 1;
        int sum = 0;

        for( int iCnt = 1;iCnt <= (n-2);iCnt++)
        {
            sum = start + end;
            start = end;
            end = sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            int iRet = findNumber(sc.nextInt());
            System.out.println(iRet);
        }
    }
    
}
