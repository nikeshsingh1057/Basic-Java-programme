//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    
    public static int findPages(int[]arr,int N,int m)
    {
        if(m>N)
            return -1;
            
        int sum=0;
        int ans=-1;
        
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        int s=0,e=sum;
        int mid=s+(e-s)/2;
        
        while(s<=e)
        {
            if(isitpossible(arr,mid,m)==true)
            {
                ans=mid;
                e=mid-1;
            }
            else
                s=mid+1;
                
             mid=s+(e-s)/2;
        }
        return ans;    
    }
    public static boolean isitpossible(int[] arr,int mid,int m)
    {
        int pgsum=0; // count sum
        int k=1;
        
        for(int i=0;i<arr.length;i++)
        {
            if((pgsum+arr[i])<=mid){
                
                pgsum += arr[i];
            }
            else{
                
                k++;
                if(k>m || arr[i]>mid)  {   // agar element mid se jayada 
                    return false;
                }
                
                pgsum=arr[i];
            }
        }
        return true;
    }
};