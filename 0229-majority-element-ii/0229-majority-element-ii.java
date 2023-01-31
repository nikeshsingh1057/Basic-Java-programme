class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
        ArrayList<Integer> ll=new ArrayList<>();
        
        if(arr.length==1){
            
            ll.add(arr[0]);
            return ll;
        }
        
        if(arr.length==2 && arr[0]!=arr[1])
        {
            ll.add(arr[0]);
            ll.add(arr[1]);
            return ll;
        }
        
        int t=arr.length/3;
       
        Arrays.sort(arr);
        int count=0;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1]){
                
                count++;
                
                if(count>=t && !ll.contains(arr[i]))
                {
                    ll.add(arr[i]);
                }
            }
            else
                count=0;
        }
        return ll;
    }
}