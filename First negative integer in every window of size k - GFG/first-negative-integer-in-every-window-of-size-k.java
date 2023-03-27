//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
        ArrayList<Long> ll=new ArrayList<>();
           int f=0;
           
           for(int i=0;i<=(n-k);i++)
            {
                f=0;

                for(int j=i;j<k+i;j++)
                {
                    if(arr[j]<0)
                    {
                        f=1;
                        ll.add(arr[j]);
                        break;
                    }
                }

                if(f==0)
                    ll.add(0L);
            }
        
        long ans[]=new long[ll.size()];
        
        int i=0;
        for(Long ele:ll)
            ans[i++]=ele;
        
        return ans;
    }
}