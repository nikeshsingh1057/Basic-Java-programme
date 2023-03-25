class Solution {
    public int majorityElement(int[] arr) {
        
        if(arr.length==1)
            return arr[0];
        
        Arrays.sort(arr);
        
        int count=1;
        int max=0;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i]){
                count++;
                // max=Math.max(max,count);
                if(count>(arr.length/2))
                    return arr[i];
            }
                
            else{
                count=1;
            }
        }
        return 0;
    }
}