class Solution {
    public void moveZeroes(int[] arr) {
        
        int i=0,j=0;
        while(i<arr.length)
        {
            if(arr[i]!=0 && arr[j]!=0)
            {
                j++;
            }
            else if(arr[i]!=0 && arr[j]==0)
            {
                arr[j]=arr[i];
                arr[i]=0;
                j++;
            }
            i++;
        }
    }
}