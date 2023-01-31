class Solution {
    public int[] twoSum(int[] arr, int t) {
        
        int ans[]=new int[2];
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==t)
                {
                    ans[0]=i;
                    ans[1]=j;
                    
                    return ans;
                }
            }
        }
        return ans;
    }
}