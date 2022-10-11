// Increasing Triplet Subsequence

class Solution {
    public boolean increasingTriplet(int[] arr) {
        
        int first_max=Integer.MAX_VALUE;        
        int second_max=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=first_max)
            {
              first_max=arr[i];
            }
            
            else if(arr[i]<=second_max)
            {
                second_max=arr[i];
            }
            
            else
               return true;
        }
        
    return false;
        
    }
}
