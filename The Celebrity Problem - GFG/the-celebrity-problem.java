//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	for(int i=0;i<n;i++)
    	{
    	    int r=checkRow(arr[i]);
    	    int c=checkCol(arr,i);
    	    
    	    if(r==0 && c==(n-1))
    	        return i;
    	}
    	return -1;
    }
    public static int checkRow(int [] arr)
    {
        int z=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==1)
                z++;
        return z;
    }
    public static int checkCol(int [][] arr,int col)
    {
        int O=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i][col]==1)
                O++;
        return O;
    }
    
}