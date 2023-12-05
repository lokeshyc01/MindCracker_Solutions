class CheckStringEqual {
    public static void main(String x[])
    {
        String arr1[] = {"ab", "c"};
        String arr2[] = {"a", "bc"};

        arrayStringsAreEqual(arr1, arr2);
    }

    private static void arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int iCnt = 0; iCnt < word1.length;iCnt++)
        {
            str1.append(word1[iCnt]);
        }

        for(int iCnt = 0 ;iCnt < word2.length;iCnt++)
        {
           str2.append(word2[iCnt]);
        }
        System.out.println(str1+"=>"+str2);
       if(str1.compareTo(str2) == 0)
       {
            System.out.println("true");
       }
       else
       {
        System.out.println("false");
       }
    }
}