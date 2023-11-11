class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> list = new ArrayList<>();
        int count = 0; 
        int total = matrix.length * matrix[0].length;

        int startCol = 0;
        int startRow = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length - 1;

        while(count < total)
        {
            // printing first row starts from firstCol to endCol
            for(int iCnt = startCol;iCnt <= endCol && count < total ;iCnt++)
            {
                list.add(matrix[startCol][iCnt]);
                count++;
            }
            startRow++;

            // printing End Col from starting row to ending row

            for(int iCnt = startRow; iCnt <= endRow && count < total; iCnt++)
            {
                list.add(matrix[iCnt][endCol]);
                count++;
            }
            endCol--;

            // printing endRow starting from endCol to startCol
            for(int iCnt = endCol;iCnt>=startCol && count < total;iCnt--)
            {
                list.add(matrix[endRow][iCnt]);
                count++;
            }
            endRow--;

            // printing First col starting from endRow to firstRow
            for(int iCnt = endRow; iCnt >=startRow && count < total;iCnt--)
            {
                list.add(matrix[iCnt][startCol]);
                count++;
            }
            startCol++;
        }
    return list;
    }
}