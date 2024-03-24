import java.math.BigDecimal;

public class FactorialCount {
    public static BigDecimal factorial(int N)
    {
        if(N == 1) return BigDecimal.ONE;
        if(N == 0) return BigDecimal.ONE;
        BigDecimal res = BigDecimal.ONE;
      
        for(int iCnt = N ; iCnt >= 2 ; iCnt --)
        {
            res = res.multiply(BigDecimal.valueOf(iCnt));
        }
        return res;
    }
    public static int digitsInFactorial(int N){
        
        BigDecimal fact = factorial(N);
        
        String str = ""+fact;
        return str.length();
    }
    
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(42));
    }
}
