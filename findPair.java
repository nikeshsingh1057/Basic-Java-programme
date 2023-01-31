class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        int i=0,j=1;
        Arrays.sort(arr);
        while(i<size && j<size)
        {
          if(j>i && arr[j]-arr[i]==n) // since j is always greater.
          return true;
          
          if(j==i || arr[j]-arr[i]<n)
          j++;
          
          else
          i++;
        }
        return false;
    }
}
