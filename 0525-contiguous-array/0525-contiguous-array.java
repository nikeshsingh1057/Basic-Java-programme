class Solution {
    public int findMaxLength(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                arr[i]=-1;
        }
        
        return largestSubarray(arr);
    }
    public static int largestSubarray(int [] arr)
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,-1);
        
        int sum=0,ans=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            
            if(hs.containsKey(sum)==false)
                hs.put(sum,i);
            
            else
            {
                ans=Math.max(ans,i-hs.get(sum));
            }
        }
        return ans;
    }
        
}