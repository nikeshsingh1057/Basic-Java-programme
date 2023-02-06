class Solution {
    public int[] shuffle(int[] num, int n) {
        
        int arr[]=new int[2*n];
        
        int i=0,j=n;
        int k=0;
        
        while(k<arr.length)
        {
            arr[k]=num[i];
            
            k++;
            
            arr[k]=num[j];
            
            i++;
            j++;
            
            k++;
        }
        return arr;
    }
}