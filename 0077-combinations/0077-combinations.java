class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> ll=new ArrayList<>();
        
        int arr[]=new int[n];
		comb(arr,k,0,0,ans,ll);
        return ans;
    }
    
    public static void comb(int arr[],int k,int count,int j,List<List<Integer>> ans, List<Integer> ll)
        
	{
		if(count==k)
		{
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=j;i<arr.length;i++)
		{
			if(arr[i]==0) {
				
				arr[i]=1;
                ll.add(i+1);
                
				comb(arr,k,count+1,i+1,ans,ll);
                
				arr[i]=0;
                ll.remove(ll.size()-1);
			}
		}
	}
}