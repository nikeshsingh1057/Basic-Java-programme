// Largest Positive Integer That Exists With Its Negative

class Solution {
    public int findMaxK(int[] arr) {
        
        Arrays.sort(arr);
        
        // using two pointer approch
        
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if((arr[i]+arr[j])>0)
                j--;
            else if((arr[i]+arr[j])==0)
                return arr[j];
            else
                i++;
        }
        return -1;
    }
}
