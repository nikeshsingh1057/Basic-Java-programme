class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll= new ArrayList<>();
        
        SubsetPrint(nums,0,ans,ll);
        return ans;
    }
    
    public static void SubsetPrint(int arr[],int i,List<List<Integer>> ans,List<Integer> ll)
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(ll));
            return;
        }
        
        int a=arr[i];
        
        SubsetPrint(arr, i+1,ans,ll);
        
        ll.add(a);
        
        SubsetPrint(arr, i+1,ans,ll);
        
        ll.remove(ll.size()-1);
    }
}