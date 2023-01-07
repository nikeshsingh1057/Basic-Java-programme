class Solution {
    public int arrayNesting(int[] nums) {
        
        int visited[]=new int[nums.length];// mark visited element.
        int max=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            
            while(visited[i]!=1)
            {
                visited[i]=1;
                count++;
                
                i=nums[i];
            }
            max=Math.max(count,max);
        }
        return max;
    }
}