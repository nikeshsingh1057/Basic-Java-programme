class Solution {
    public int longestOnes(int[] arr, int k) {
        
        
        int ans=0,i=0,j=0,count=0;
        
        while(i<arr.length)
        {
            if(arr[i]==0)
                count++;
            
            while(count>k)
            {
                if(arr[j]==0)
                    count--;
                j++;
            }
            
            ans=Math.max(ans,i-j+1);
            i++;
        }
        return ans;    
    }
}