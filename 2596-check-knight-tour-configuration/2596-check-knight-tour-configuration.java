class Solution {
    
    static int a=0;
    
    public boolean checkValidGrid(int[][] grid) {
        
        if(grid.length==3 || grid.length==4)
            return false;
        
        a=0;
        int [][] chess=new int[grid.length][grid[0].length];
        
        KnightTour(chess,0,0,0,grid);
        
        if(a==1)
            return true;
        
        return false;
    }
    
    public static void KnightTour(int [][] chess,int r,int c,int move,int [][] grid)
    {
        
        if(r<0 || c<0 || r>=chess.length || c>=chess[0].length || chess[r][c]>0){
            return;
        }
        
        else if(move==(chess.length*chess[0].length)-1)
        {
            chess[r][c]=move;

            a=1;

            chess[r][c]=0;

        }
        
        chess[r][c]=move;
        
        if((chess[r][c]) == grid[r][c]){
            
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