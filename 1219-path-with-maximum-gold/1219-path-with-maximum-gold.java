class Solution {
    
    static int count;
    
    public int getMaximumGold(int[][] grid) {
        
         
        count=0;
        
        for(int i=0; i<grid.length; i++)            // hum sare jagh ke starting poing se start karenge (so we use loop rat in maze me kewal 0,0 start karte thee lekin yahi hume sare jagh se start karke dekhana hoga.)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                 maxpath( grid, i, j, 0, new boolean[grid.length][grid[0].length]);
            }
        }
       
       
        return count;
    }
    public static void maxpath(int [][] arr,int cr,int cc,int sum, boolean [][] visited)
    {
        count=Math.max(count,sum);
        
        if(cr<0 || cc<0 || cr>=arr.length || cc>=arr[0].length || arr[cr][cc]==0 || visited[cr][cc]==true)
            return;
        
        visited[cr][cc]=true;
        
        maxpath(arr,cr-1,cc,sum+arr[cr][cc],visited);
        
        maxpath(arr,cr+1,cc,sum+arr[cr][cc],visited);
        
        maxpath(arr,cr,cc+1,sum+arr[cr][cc],visited);
        
        maxpath(arr,cr,cc-1,sum+arr[cr][cc],visited);
        
        visited[cr][cc]=false;
    }
}