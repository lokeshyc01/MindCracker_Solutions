public class CalculatePower 
{
    static int calculatePower(int base,int power)
    {
        if(power == 0)
        {
            return 1;
        }
        int ans = base * calculatePower(base, power - 1);
        return ans;
    }
    public static void main(String[] args) {
       int result =  calculatePower(3,2);
       System.out.println(result);
    }    
}
