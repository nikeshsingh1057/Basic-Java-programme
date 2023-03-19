class Solution {
    
    static int a=0;
    
    public boolean checkValidGrid(int[][] grid) {
        
     //   if(grid.length==3 || grid.legnth==4) // It is not possible to move all grid cell
     //       return false;         //you can do dry run. (if we on this sol become more faster)
        a=0;
        
        int [][] chess=new int[grid.length][grid[0].length];
        
        KnightTour(chess,0,0,1,grid);      // here i start with one because if i start with 0 than it will give worng for testcase example 2 becasue after 7 it again move to chess[0][0] and it was already visited if i passed with 0 hence two times visited for r=0 ,c=0 . so to avoid that we pass with 1.
        
        if(a==1)
            return true;

        return false;
    }
    
    public static void KnightTour(int [][] chess,int r,int c,int move,int [][] grid)
    {
        
        if(r<0 || c<0 || r>=chess.length || c>=chess[0].length || chess[r][c]>0){
            return;
        }
        
        else if(move==chess.length*chess[0].length)
        {
            a=1;
        }
        
        chess[r][c]=move; // marking visited. (it is also work for visiting not take extra visited array for checking.)
        
        if((chess[r][c]-1) == grid[r][c])   // here we do -1 because i start with 1 not with 0.
        {
            KnightTour(chess, r-2, c+1, move+1,grid);
        
            KnightTour(chess, r-1, c+2, move+1,grid);
        
            KnightTour(chess, r+1, c+2, move+1,grid);
        
            KnightTour(chess, r+2, c+1, move+1,grid);
        
            KnightTour(chess, r+2, c-1, move+1,grid);
        
            KnightTour(chess, r+1, c-2, move+1,grid);
        
            KnightTour(chess, r-1, c-2, move+1,grid);
        
            KnightTour(chess, r-2, c-1, move+1,grid);
        }

            chess[r][c]=0;
    }
}