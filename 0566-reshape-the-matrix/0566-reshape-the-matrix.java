class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(mat.length*mat[0].length!=r*c)
            return mat;
        
        int [][] arr=new int[r][c];
        
        ArrayList<Integer> ll=new ArrayList<Integer>();
        
        for(int  i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                ll.add(mat[i][j]);
            }
        }
        
        int count=0;
        int k=0;
        
        while(count<r)
        {
            for(int i=0;i<c;i++)
            {
                arr[count][i]=ll.get(k);
                k++;
            }
            count++;
        }
        
        return arr;
    }
}