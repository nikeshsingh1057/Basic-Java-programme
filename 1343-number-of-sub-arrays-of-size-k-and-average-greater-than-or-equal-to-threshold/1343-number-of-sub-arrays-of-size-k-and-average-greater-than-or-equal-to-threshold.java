class Solution {
    public int numOfSubarrays(int[] arr, int k, int th ){
        
        int ans=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if((sum/k)>=th)
            ans++;
        
        for(int i=k;i<arr.length;i++)
        {
            
            sum+=arr[i]-arr[i-k];
            
            if((sum/k)>=th)
                ans++;
        }
        return ans;
    }
}