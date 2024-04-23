public class CheckTwoOddOccuring {
    public static void print(int arr[])
    {
        int res = 0;
        for(int i : arr)
        {
            res = res ^ i;
        }

        int k = res & (~(res - 1));
        int res1 = 0,res2 = 0;

        for(int i : arr)
        {
            if((i & k) != 0){
                res1 = res1 ^ i;
            }
            else{
                res2 = res2 ^ i;
            }
        }
        System.out.println(res1 + " " + res2);
    }
    public static void main(String[] args) {
            print(new int[]{1,2,3,4,3,3,1,2,4,9});
    }
}
