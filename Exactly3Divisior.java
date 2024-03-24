import java.util.ArrayList;

public class Exactly3Divisior {

    public static int exactly3Divisors(int N)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int iCnt = 1 ; iCnt <= N ; iCnt++)
        {
            int count = 0;
            for(int j = 1 ; j * j <= iCnt ; j++)
            {
                if(iCnt % j == 0){
                    count++;
                }
            }
            
            if(count == 3)
            {
                list.add(iCnt);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(67));
    }
}
