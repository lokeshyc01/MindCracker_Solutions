
public class Solution{

public int Solve(int N,int from,int to,int aux)
{
	
if(N == 1) return 1;


int count = solve(N-1,from,aux,to);

//move the nth disk from 'from' to 'to' rod which require only one step

count++;

//move n-1 disk from 'aux' rod to 'to' rod with the help of 'from' rod
count += solve(N-1,aux,to,from);

return count;


}

}