class Solution {
    public int findPeakElement(int[] arr) {
        
        int low=0;
        int high=arr.length-1;
        
        while(low<high)
        {
            int mid=low+(high-low)/2;
            
            if(mid>0 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                return mid;
            
           else if(arr[mid]>arr[mid+1])
                high=mid;
            
           else if(arr[mid]<arr[mid+1])
                low=mid+1;
            
        }
        return low;
    }
}