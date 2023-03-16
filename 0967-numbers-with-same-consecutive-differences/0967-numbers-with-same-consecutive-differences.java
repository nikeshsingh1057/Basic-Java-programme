class Solution {
    // solved by watching vedio
    public int[] numsSameConsecDiff(int n, int k) {
        
        ArrayList<Integer> ll=new ArrayList<>();
        
        for(int i=1;i<=9;i++)
        {
            dfs(n,k,i,0,i,ll);
        }
        
        int ans[]=new int[ll.size()];
        
        for(int i=0;i<ll.size();i++)
            ans[i]=ll.get(i);
        
        return ans;
    }
    public static void dfs(int n,int k,int cur,int i,int prev, ArrayList<Integer> ll)
    {
        if(i==n-1)
        {
            ll.add(cur);
            return;
        }
        
        int next=prev+k;
        
        if(next<10){
            
            dfs(n,k,(cur*10)+next,i+1,next,ll);
        }
 
        next=prev-k;
        
        if(k!=0 && next>=0){
                
            dfs(n,k,(cur*10)+next,i+1,next,ll);
        }
    }
}