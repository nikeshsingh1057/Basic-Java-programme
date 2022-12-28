class Solution {
    public int longestSubarray(int[] arr) {
        
   // this question is similar to (k flip to make string longest ). code is also same just here we need to flip only 1 ans substract 1 from ans.
        
        int i=0,j=0,ans=0;
        int count=0;
        
        while(i<arr.length)
        {
            if(arr[i]==0) 
                count++;
            
            while(count>1)
            {
                if(arr[j]==0)
                    count--;
                j++;
            }
            
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans-1;
    }
}
