class Solution {
public:

    int countOverlaps(vector<vector<int>>& A, vector<vector<int>>& B,int rowoff , int coloff)
    {
        int count = 0; 
        int n = A.size();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {

                

                /*
                A[i][j] -> B[i+rowoff][i+coloff]
                */
                int B_i = i + rowoff;
                int B_j = j + coloff;

                if(B_i >= n || B_i < 0 || B_j >= n || B_j < 0){
                    continue;
                }

                if(A[i][j] == 1 && B[B_i][B_j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    int largestOverlap(vector<vector<int>>& img1, vector<vector<int>>& img2) {
        int n = img1.size();

        int countOverlap = 0;
        for(int i = -n + 1 ; i < n ; i++){
            for(int j = -n + 1 ; j < n ; j++){
                int count = countOverlaps(img1,img2,i,j);
                countOverlap = max(count,countOverlap);
            }
        }
        return countOverlap;
    }
};