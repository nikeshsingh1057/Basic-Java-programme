class Solution {
    public int lengthOfLongestSubstring(String str) {
        
        int i=0,j=0;
        int arr[]=new int[256];
        int ans=0;
        while(i<str.length())
        {
            if(arr[str.charAt(i)]==0)
            {
                arr[str.charAt(i)]++;
                ans=Math.max(i-j+1,ans);
                i++;
            }
            else
            {
                arr[str.charAt(j)]--;
                j++;
            }
        }
        return ans;
    }
}