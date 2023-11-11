class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        boolean flag = false;
        int start = 0; 
        int end = (matrix.length * matrix[0].length) - 1;

        int col = matrix[0].length;
        int mid = (start + end) /2 ;

        while(start <= end)
        {
            int element = matrix[mid/col][mid%col];

            if(element == target)
            {
                flag = true;
                break;
            }
            else if(element < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }


            mid = (start + end ) / 2;
        }
        return flag;
    }
}