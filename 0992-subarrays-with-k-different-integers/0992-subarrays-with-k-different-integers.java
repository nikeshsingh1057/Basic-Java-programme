class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        
        return At_Most(arr,k)- At_Most(arr,k-1);
        
// logic is we find first at_most k distint substring and than we find at_most k-1 distint integer and than substract do dry run and find all atmost k substring and atmost k-1 sbustring and sustract you well get same answer.
       
    }
    
    public static int At_Most(int arr[],int k)
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        int i=0,j=0,ans=0;
        
        while(i<arr.length)
        {
            hs.put(arr[i] , hs.getOrDefault(arr[i] , 0) + 1);
            
    
                while(hs.size()>k)      // shirnking from here.
                {
                    
                     if(hs.get(arr[j])==1)    // removing element from here.
                        hs.remove(arr[j]);
                    
                    else
                        hs.put(arr[j] , hs.get(arr[j])-1);
                    
                    j++;
                }
            ans+=i-j+1;
            
            i++;
        }
        return ans;
    }
}