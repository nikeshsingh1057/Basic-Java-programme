class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<Integer> ll= new ArrayList<>();
        
        List<List<Integer>>ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
            ll.add(nums[i]);
        
        while(ll.size()>0){
            
            List<Integer> temp=new ArrayList<>();
            
            for(int i=0;i<ll.size();i++)
            {
                if(!temp.contains(ll.get(i))){
                    
                    temp.add(ll.get(i));
                    
                    ll.remove(i);
                    i--;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}