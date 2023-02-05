class Solution {
    
    static int count=0;
    
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n==0)
            return 1;
        
        count=0;
        
        int arr[]=new int[11];
        
        
        unique(n,arr,0);
        
        return count;
        
    }
   	public static void unique(int n,int arr[],int sum)
    {
		// we are using backtracking here.

		String ans=""+sum;
        if(ans.length()>n)
            return;

        count++;
    
		int i=0;

		if(sum==0) {        // this is very important line. 
			i=1;
		}
        
        for(;i<=9;i++)
        {
            if(arr[i]==0){
                
                arr[i]=1;
                unique(n,arr,sum*10+i);      // backtrack.
                arr[i]=0;
            }
                
        }
    }
}