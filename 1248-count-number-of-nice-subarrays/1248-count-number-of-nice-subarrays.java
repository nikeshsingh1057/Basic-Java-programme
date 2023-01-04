class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        
        return Atmost(arr,k)-Atmost(arr,k-1);
        
        // similar question subarray with k distint integers. 
    }
    public static int Atmost(int [] arr,int k)
    {
        int count=0,i=0,j=0,ans=0;
        
        while(i<arr.length)
        {
            if((arr[i] & 1)==1)
                count++;     

            while(count>k)     
            {
                if((arr[j] & 1)==1)
                    count--;          
                j++; 
            }
            ans+=i-j+1;
            i++;
        }
        return ans;
    }
}