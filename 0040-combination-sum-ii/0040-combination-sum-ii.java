class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        // here is not infinite supply so we increase i+1 in every function frame.
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        
        Arrays.sort(candidates);
        
        combinationPrint(target,candidates,ans,ll,0);
        return ans;
    }
    public static void combinationPrint(int amount,int [] coin,List<List<Integer>> ans,List<Integer> ll,int j)
	{
	        if(amount==0)
	        {
	            ans.add(new ArrayList<>(ll));
	            return;
	        }
	        for(int i=j;i<coin.length;i++)
	        {
	            if(i==j || coin[i]!=coin[i-1]){
	               
	              if(amount>=coin[i]){
                    
                    ll.add(coin[i]);
                      
	                combinationPrint(amount-coin[i],coin,ans,ll,i+1);
                      
                     ll.remove(ll.size()-1);
	              }
	                
	            }
//	            while(i<coin.length-1 && coin[i]==coin[i+1])/ we can also use it in                                                           place of it for checking dublicate.
//	                 i++;
	        }
	}
}