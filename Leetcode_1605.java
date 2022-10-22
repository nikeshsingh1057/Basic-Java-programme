// Find Valid Matrix Given Row and Column Sums

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int arr[][]=new int [rowSum.length][colSum.length];
        
        for(int i=0;i<rowSum.length;i++)
        {
            for(int j=0;j<colSum.length;j++)
            {
                int ans=Math.min(rowSum[i],colSum[j]);
                arr[i][j]=ans;
                
                rowSum[i]-=ans;
                colSum[j]-=ans;
            }
        }
        return arr;
    }
}
