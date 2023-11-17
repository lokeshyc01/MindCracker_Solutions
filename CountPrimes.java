class CountPrimes{
    public int countPrimes(int n) {
        
       if(n < 2)
       {
           return 0;
       }

//n+1 if size 2 then it will be 3 and there can be 0 1 2 index 
        boolean isPrime[] = new boolean[n+1];

//intializing whole array with true value
        Arrays.fill(isPrime,true);

        isPrime[0] = isPrime[1] = false;
       
        for(int iCnt = 2; iCnt <= n ; iCnt++)
        {
//just making all the multiple indexes of particular index false
            for(int jCnt = iCnt * 2;jCnt <= n;jCnt += iCnt)
            {
                isPrime[jCnt] = false;
            }
        }

//counting prime number 
        int counter = 0;
        for(int i = 2; i < n ; i++)
        {
            if(isPrime[i])
            {
                counter++;
            }
        }
        return counter;
    }
}