class Solution {
    public int splitNum(int num) {
        
        String l=num+"";
        
        int arr[]=new int[l.length()];
        
        int i=0;
        while(num!=0)
        {
            int rem = num%10;
            arr[i++] = rem;
            num/=10;
        }
        
        Arrays.sort(arr);
        
        String a="";
        String b="";
     
        for(i=0;i<arr.length;i++)
        {
            if(i%2==0){
                
               a+=arr[i];
            }
            else{
                
               b+=arr[i];
            }
        }
        
        int c=Integer.valueOf(a);
        int d=Integer.valueOf(b);
        
        return c+d;
    }
}