class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        
        if(k>n)
            return ans;
        
        combination(k,n,ans,ll,1);
            
        return ans;
    }
    public static void combination(int k,int n,List<List<Integer>> ans,List<Integer> ll,int idx)
    {
        if(n==0 && ll.size()==k)
        {
            ans.add(new ArrayList(ll));
            return;
        }
        
        for(int i=idx;i<=9;i++)
        {
            if(n>=i){
                
                ll.add(i);
                
                combination(k,n-i,ans,ll,i+1);
                
                ll.remove(ll.size()-1);
            }

        }
    }
}