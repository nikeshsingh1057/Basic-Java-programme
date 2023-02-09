class Solution {
    public int totalFruit(int[] arr) {
        
       HashMap<Integer,Integer> hs = new HashMap<>();
        
        int i=0;
        int j=0;
        
        int ans=0;
        
        while(i<arr.length)
        {
           
            hs.put(arr[i], hs.getOrDefault(arr[i],0) + 1);
    
            while(hs.size()>2){
                
                  hs.put(arr[j], hs.get(arr[j]) - 1);
                    
                 if(hs.get(arr[j]) == 0) 
                     hs.remove(arr[j]);
               
                  j++;
            }
            ans = Math.max(ans,i-j+1);
            i++;
        }
        return ans;
    }
}
