class Solution {
    public int maxArea(int[] arr) {
        
        int i=0,j=arr.length-1;
        int ans=0;
        // viswalise solution on pen and paper just like two pointer approch
        while(i<j)
        {
            int width=j-i;
            int hight=Math.min(arr[i],arr[j]);
            
            ans=Math.max(ans,width*hight);
            
            if(arr[i]<arr[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}