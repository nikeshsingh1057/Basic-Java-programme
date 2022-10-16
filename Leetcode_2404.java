// Most Frequent Even Element leetcode_2404

class Solution {
    public int mostFrequentEven(int[] nums) {
        
        int arr[]=new int[100001];  // new empty array allocate.
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                arr[nums[i]]++;
        }
        
        int count=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
                continue;
            
           else if(arr[nums[i]]!=0 && arr[nums[i]]>=count)
            {
               if(nums[i]!=0 && arr[nums[i]]>count) {  // if zero is at first position in nums[i] than our minimum is always is 0 hence to avoid it we use this line.
                   ans=nums[i]; }
               
                ans=Math.min(nums[i],ans);
                count=arr[nums[i]];
                arr[nums[i]]=0;
            }
        }
        if(count==-1)
            return -1;
        return ans;
    }
}
